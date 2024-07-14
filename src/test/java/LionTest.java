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

    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самец");
    }

    @Test
    public void testGetKittens() {
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void testLionSexInvalid() {
        assertThrows(Exception.class, () -> new Lion("InvalidSex"));
    }

    @Test
    public void testGetFood() throws Exception {
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}

