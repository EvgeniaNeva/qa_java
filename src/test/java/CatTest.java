import static org.junit.Assert.assertEquals;

import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline predator;
    private Cat cat;

    @Before
    public void setUp() {
        cat = new Cat(predator);
    }

    @Test
    public void testGetSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(expectedFood);
        List<String> actual = cat.getFood();
        assertEquals(expectedFood, actual);
    }
}

