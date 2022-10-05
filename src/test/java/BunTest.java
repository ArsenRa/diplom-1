import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

//@RunWith(MockitoJUnitRunner.class)
public class BunTest {

    @Test
    public void getBunNameCorrect() {
        Bun bun = new Bun("Булошка",350.F);
        String expected = "Булошка";
        String actual = bun.getName();
        assertEquals(expected,actual);

    }

    @Test
    public void getBunPriceCorrect() {
        Bun bun = new Bun("Булошка",350.F);
        float expected = 350.F;
        float actual = bun.getPrice();
        assertEquals(expected,actual, 230.F);

    }
}
