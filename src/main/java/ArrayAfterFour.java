import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAfterFour {
    public static Integer[] newArray(int[] array){
        List<Integer> list = new ArrayList<>();
        for (int i = array.length - 1; i >= 0 ; i--) {
            if (array[i] == 4) break;
            list.add(0, array[i]);
        }
        if (list.size() == array.length){
            throw new RuntimeException("Нет ни одной 4 в масиве");
        }
        Integer[] newArray = list.toArray(new Integer[0]);
        return newArray;
    }
}

