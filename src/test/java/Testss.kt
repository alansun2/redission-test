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
class Testss {

    private var redisson: RedissonClient? = null

    @Before
    fun before() {
        val config = Config()
        //        config.setTransportMode(TransportMode.EPOLL);
        config.useSingleServer() //可以用"rediss://"来启用SSL连接
                .setAddress("redis://localhost:6379")
                .setPassword("123456").database = 4
        redisson = Redisson.create(config)
    }

    @Test
    fun localMapTest() {
        val options = LocalCachedMapOptions.defaults<Int, String>().syncStrategy(LocalCachedMapOptions.SyncStrategy.INVALIDATE).reconnectionStrategy(LocalCachedMapOptions.ReconnectionStrategy.CLEAR).evictionPolicy(LocalCachedMapOptions.EvictionPolicy.NONE)
        val tt = redisson!!.getLocalCachedMap("tt", options)
        tt[1] = "test1"
        Thread.sleep(20000)
        println("content:" + tt[1])
    }
}