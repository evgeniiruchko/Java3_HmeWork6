import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOneAndFourTest {
    private ArrayOneAndFour arrayOneAndFour;

    @Test
    void checkArray() {
        int[] array = new int[]{1, 2, 0, 4, 2, 0, 7};
        Assertions.assertFalse(arrayOneAndFour.CheckArray(array));
    }

    @Test
    void CheckOnlyOne(){
        int[] array = new int[]{1, 1, 1, 1};
        Assertions.assertFalse(arrayOneAndFour.CheckArray(array));
    }

    @Test
    void CheckOnlyFour(){
        int[] array = new int[]{4, 4, 4, 4};
        Assertions.assertFalse(arrayOneAndFour.CheckArray(array));
    }

    @Test
    void CheckRightArray(){
        int[] array = new int[]{1, 4, 4, 4};
        Assertions.assertTrue(arrayOneAndFour.CheckArray(array));
    }
}