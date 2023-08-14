package task2;

public class NumbersHandler {
    private SmartArray numbers;

    public NumbersHandler(SmartArray numbers){
        this.numbers = numbers;
    }

    public int getQuantity(){
        return numbers.getArray().length;
    }

    public double calcAverage(){
        int[] array = numbers.getArray();
        double res = 0;
        for (int num : array) {
            res += num;
        }
        // String result = String.format("%.3f",average);
        // return result;
        return res /array.length;
    }

    public void printStart(){
        System.out.printf("Size: " + getQuantity());
        System.out.println("\nAverage value: " + calcAverage());
    }

}
