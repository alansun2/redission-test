import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.redisson.Redisson
import org.redisson.api.RedissonClient
import org.redisson.codec.JsonJacksonCodec
import org.redisson.config.Config
import java.text.MessageFormat
import java.util.concurrent.TimeUnit

/**
 * @author AlanSun
 * @date 2020/3/24 10:57
 *
 */
@RunWith(JUnit4::class)
class BucketTest {

    private var redisson: RedissonClient? = null

//    @Before
//    fun before() {
//        val config = Config().setCodec(JsonJacksonCodec())
//        //        config.setTransportMode(TransportMode.EPOLL);
//        config.useSingleServer() //可以用"rediss://"来启用SSL连接
//                .setAddress("redis://localhost:6379")
//                .setPassword("xxxxx").database = 4
//        redisson = Redisson.create(config)
//    }

    @Test
    fun localMapTest() {
        val tt = redisson!!.getBucket<TestObject>("test")
        val testO = TestObject()
        testO.id = 1
        testO.name = "Alan"
        tt.set(testO)
        tt.expire(100, TimeUnit.SECONDS)
        Thread.sleep(5000)
    }

    @Test
    fun testttt() {
        val s = "s%sdfsdasf%sasfasdf"
        val s1 = "{0}sdfsdasfadsaf{1}"
        val start = System.currentTimeMillis()
        for (i in 1..10000) {
            MessageFormat.format(s1, "sdf", "sdfs撒发生")
//            String.format(s, "sdf", "asfas是否")
        }
        println(System.currentTimeMillis() - start)
    }
}