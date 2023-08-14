import java.util.Arrays;

public class SmartArrayObj {
    private int size = 0;
    private Person [] arr = new Person[4];
    public void add(Person element){
        if(size >= arr.length){
            increaseArray();
        }
        arr[size] = element;
        size++;
    }
    private void increaseArray(){
        Person [] tempArray = new Person[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }
    public String specialtoString(){
        return Arrays.toString(arr) + " size: " + size;
    }
    public String toString(){
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += arr[i] + " ";
        }
        res = res.trim();
        res+= "]";
        return res;
    }
    public void remove(int index){
        if (index >= 0 && index < size){
            for (int i = index + 1; i < size; i++) {
                arr[i-1] = arr[i];
            }
            size--;
        }
    }
    public void removeById(int id){
        int index = getIndexById(id);
        remove(index);
    }
    public int getIndexById(int id){
        int res = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i].getId() == id) return i;
        }
        return res;
    }
}
