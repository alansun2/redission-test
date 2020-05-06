import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.redisson.Redisson;
import org.redisson.api.LocalCachedMapOptions;
import org.redisson.api.RLocalCachedMap;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.config.TransportMode;

/**
 * @author AlanSun
 * @date 2020/3/24 10:09
 */
@RunWith(JUnit4.class)
public class RedissonCollectionsTest {

    private RedissonClient redisson;

    @Before
    public void before() {
        Config config = new Config();
//        config.setTransportMode(TransportMode.EPOLL);
        config.useSingleServer()
                //可以用"rediss://"来启用SSL连接
                .setAddress("redis://localhost:6379")
                .setPassword("xxxx")
                .setDatabase(3);

        redisson = Redisson.create(config);
    }

    @Test
    public void localMapTest() {
        LocalCachedMapOptions<Integer, String> options = LocalCachedMapOptions.defaults();
        RLocalCachedMap<Integer, String> tt = redisson.getLocalCachedMap("tt", options);

    }
}
