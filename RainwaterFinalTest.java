import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RainwaterFinalTest {

    @Test
    public void testExample() {
        int[] map = {1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, RainwaterFinal.rainFall(map));
    }

    @Test
    public void testNoWater() {
        int[] map = {1, 2, 3, 4, 5};
        assertEquals(0, RainwaterFinal.rainFall(map));
    }

    @Test
    public void testSimpleValley() {
        int[] map = {3, 0, 3};
        assertEquals(3, RainwaterFinal.rainFall(map));
    }

    @Test
    public void testMultipleValleys() {
        int[] map = {3, 0, 2, 0, 4};
        assertEquals(7, RainwaterFinal.rainFall(map));
    }

    @Test
    public void testFlatGround() {
        int[] map = {2, 2, 2, 2};
        assertEquals(0, RainwaterFinal.rainFall(map));
    }

    @Test
    public void testEmptyMap() {
        int[] map = {};
        assertEquals(0, RainwaterFinal.rainFall(map));
    }

    @Test
    public void testSingleBar() {
        int[] map = {5};
        assertEquals(0, RainwaterFinal.rainFall(map));
    }

    @Test
    public void testDescending() {
        int[] map = {5, 4, 3, 2, 1};
        assertEquals(0, RainwaterFinal.rainFall(map));
    }
}
