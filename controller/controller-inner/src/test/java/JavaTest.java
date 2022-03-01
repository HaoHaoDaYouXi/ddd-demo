import com.java.demo.DemoInnerBootstrap;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * JavaTest
 *
 * @author TONE
 * @date 2022/3/1
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoInnerBootstrap.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JavaTest {

    @Test
    public void test(){
        log.info("test");
    }
}
