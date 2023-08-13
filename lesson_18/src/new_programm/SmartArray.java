package new_programm;

import java.util.Arrays;

public class SmartArray {

    private int size = 0;
    private int[] arr = new int[4];
    public void add(int element){
        if(size >= arr.length){
            increaseArray();
        }
        arr[size] = element;
        size++;
    }
    private void increaseArray(){
        int [] tempArray = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }
    public String specialtoString(){
        return Arrays.toString(arr) + " size:" +size;
    }
    public String toString(){
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += " " + arr[i];
        }
        res+= "]";
        return res;

    }


}