import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.redisson.Redisson
import org.redisson.api.LocalCachedMapOptions
import org.redisson.api.RedissonClient
import org.redisson.api.condition.Conditions
import org.redisson.codec.JsonJacksonCodec
import org.redisson.config.Config
import java.util.concurrent.TimeUnit

/**
 * @author AlanSun
 * @date 2020/3/24 10:57
 *
 */
@RunWith(JUnit4::class)
class LiveObjevtTest {

    private var redisson: RedissonClient? = null

    @Before
    fun before() {
        val config = Config().setCodec(JsonJacksonCodec())
        //        config.setTransportMode(TransportMode.EPOLL);
        config.useSingleServer() //可以用"rediss://"来启用SSL连接
                .setAddress("redis://localhost:6379")
                .setPassword("xxxxxx").database = 4
        redisson = Redisson.create(config)
    }

    @Test
    fun localMapTest() {
        val liveObjectService = redisson!!.getLiveObjectService()
//        val testO = TestObject()
//        testO.id = 2
//        testO.name = "Alan"
//        liveObjectService.persist(testO)
        val get = liveObjectService.get(TestObject::class.java, 2)
        println(get.id.toString() + ":" + get.name)
    }
}