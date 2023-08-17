package classwork;

public class Arrays {

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]){
                    swap(array,j,j+1);
                    isSorted = false;
                }
            }
        }
    }

    private static void swap(int[] array, int i1, int i2){
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

}
