import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final int kittensCount;
    private final String animalKind;
    private final List<String> food;

    Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    public FelineParameterizedTest(int kittensCount, String animalKind, List<String> food) {
        this.kittensCount = kittensCount;
        this.animalKind = animalKind;
        this.food = food;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
                {1, "Травоядное", List.of("Трава", "Различные растения")},
                {3, "Хищник", List.of("Животные", "Птицы", "Рыба")},
                {2, "Неизвестный вид", List.of()}
        };
    }

    @Test
    public void testGetKittensWithParam() {
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }

    @Test
    public void testGetFood() {
        try {
            assertArrayEquals(food.toArray(), feline.getFood(animalKind).toArray());
        } catch (Exception exception) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                    exception.getMessage());
        }
    }
}
