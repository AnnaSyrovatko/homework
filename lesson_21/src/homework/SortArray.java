package homework;

import java.util.Arrays;

public class SortArray {
    private int counter1 = 0;
    private int min;
    public int[] arr;
    private int counter2 = 0;

    private void changePlace(int index){
        int temp = arr[counter1];
        arr[counter1] = min;
        arr[index] = temp;
        counter1++;
    }

    public void findMinNum(){
        min = arr[counter2];
        for (int i = counter2; i < arr.length; i++) {
            if (arr[i] <= min){
                min = arr[i];
            }
        }
        counter2++;

        changePlace(findIndex());
    }
    public void sort(){
        for (int i = 0; i < arr.length; i++) {
            findMinNum();
        }
    }

    private int findIndex(){
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == min) return i;
        }
        return 0;
    }
    public String toString() {
        return Arrays.toString(arr);
    }
}
