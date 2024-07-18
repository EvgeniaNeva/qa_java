import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    Lion lion;
    Feline feline;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();
        lion = new Lion("Самец", feline);
    }

    @Test
    public void testGetKittens() {
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void testLionSexInvalid() {
        assertThrows(Exception.class, () -> new Lion("InvalidSex", feline));
    }

    @Test
    public void testGetFood() throws Exception {
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}

