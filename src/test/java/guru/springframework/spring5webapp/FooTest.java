package guru.springframework.spring5webapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
@RunWith(SpringRunner.class)
@SpringBootTest
public class FooTest {

    @Test
    public void getBar() {
        Foo foo = new Foo();

        String result = foo.getBar();

        assertEquals("FooBar",result);
    }
}