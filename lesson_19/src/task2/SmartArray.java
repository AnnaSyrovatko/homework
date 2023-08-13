package task2;

public class SmartArray {

    private int size = 0;
    private int[] arr = new int[5];


    public void add(int element){
        if (size >= arr.length){
            increaseArray();
        }
        if(element != 0){
            arr[size] = element;
            size++;
        }
    }

    private void increaseArray(){
        int[] tempArray =  new int[size * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }

    private String countAverageValue(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / size;
        String result = String.format("%.3f",average);
        return result;
    }

    private String arrayToString(){
        String res="[";
        for (int i=0; i < size; i++){
            res+= arr[i] + " ";
        }
        res = res.trim();
        res+="]";
        return res;
    }
    public String toString(){
        return "You have input the following numbers: " + arrayToString() + "\nTotal " + size + " numbers" + "\nAverage value: " + countAverageValue();
    }

}
