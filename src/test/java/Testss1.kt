import com.ehu.bean.model.ServiceCommunity
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.redisson.Redisson
import org.redisson.api.LocalCachedMapOptions
import org.redisson.api.RedissonClient
import org.redisson.config.Config

/**
 * @author AlanSun
 * @date 2020/3/24 10:57
 *
 */
@RunWith(JUnit4::class)
class Testss1 {

    private var redisson: RedissonClient? = null

    @Before
    fun before() {
        val config = Config()
        //        config.setTransportMode(TransportMode.EPOLL);
        config.useSingleServer() //可以用"rediss://"来启用SSL连接
                .setAddress("redis://localhost:6379")
                .setPassword("123456").database = 3
        redisson = Redisson.create(config)
    }

    @Test
    fun localMapTest() {
        val options = LocalCachedMapOptions.defaults<Int, ServiceCommunity>().syncStrategy(LocalCachedMapOptions.SyncStrategy.INVALIDATE).reconnectionStrategy(LocalCachedMapOptions.ReconnectionStrategy.CLEAR).evictionPolicy(LocalCachedMapOptions.EvictionPolicy.NONE)
        val tt = redisson!!.getLocalCachedMap("SERVICE_CITY_MAP", options)
        tt.remove(310100)
        Thread.sleep(5000)
    }
}