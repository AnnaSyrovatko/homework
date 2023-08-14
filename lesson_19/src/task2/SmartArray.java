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

        public String toString(){
        String res="[";
        for (int i=0; i < size; i++){
            res+= arr[i] + " ";
        }
        res = res.trim();
        res+="]";
        return res;
    }
    public int[] getArray(){
        int[] tempArray = new int[size];
        for (int i=0; i<size;i++){
            tempArray[i]=arr[i];
        }
        return tempArray;
    }

}
