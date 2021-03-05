import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayAfterFourTest {
    private ArrayAfterFour arrayAfterFour;

    @Test
    public void TestNewArray(){
        int[] array = new int[]{1, 2, 4, 4, 2, 4, 4, 4, 7};
        int[] rightArray= new int[]{7};
        Assertions.assertEquals(Arrays.toString(rightArray) , Arrays.toString(arrayAfterFour.newArray(array)));
    }

    @Test
    public void TestNewArray2(){
        arrayAfterFour = new ArrayAfterFour();
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] rightArray= new int[]{5, 6, 7};
        Assertions.assertEquals(Arrays.toString(rightArray) , Arrays.toString(arrayAfterFour.newArray(array)));
    }

    @Test
    public void TestNewArray3(){
        int[] array = new int[]{1, 2, 0, 4, 2, 0, 7};
        Assertions.assertTrue(arrayAfterFour.newArray(array).length == 3);
    }

    @Test
    public void TestNewArray4(){
        int[] array = new int[]{1, 2, 0, 4, 2, 0, 7, 4};
        Assertions.assertTrue(arrayAfterFour.newArray(array).length == 0);
    }

    //    @Test(expected = RuntimeException.class)  так не заработало, expected подсвечивается
    @Test
    public void ExceptionTest() throws RuntimeException{
        int[] array = new int[]{1, 2, 3};
        int[] rightArray= new int[]{};
        Assertions.assertEquals(Arrays.toString(rightArray), Arrays.toString(arrayAfterFour.newArray(array)));
    }
}
