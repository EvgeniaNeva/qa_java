import static org.junit.Assert.*;

import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class FelineTest {
    Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void testGetKittensWithParam() {
        int kittenCount = 5;
        assertEquals(kittenCount, feline.getKittens(kittenCount));
    }

    @Test
    public void testGetKittens() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testEatMeat() throws Exception {
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }
}
