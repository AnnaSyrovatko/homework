package homework;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,-2,8,0,7,6,5,-5,77,4};
        SortArray find = new SortArray();
        find.arr = array;
        find.sort();
        System.out.println(find);

    }
}
