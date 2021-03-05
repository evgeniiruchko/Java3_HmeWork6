public class ArrayOneAndFour {
    public static boolean CheckArray(int[] array){
        boolean isOne = false, isFour = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 4) return false;
            if (array[i] == 1) {
                isOne = true;
            } else  {
                isFour = true;
            }
        }
        return (isFour && isOne) ? true : false;
    }
}
