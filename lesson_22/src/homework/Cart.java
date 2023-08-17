package homework;

public class Cart {
    private int size=0;
    private Product[] arr = new Product[5];

    public void add(Product element){
        if(size>= arr.length) {
            increaseArray();
        }
        arr[size] = element;
        size++;
    }

    private void increaseArray(){
        Product[] tempArray = new Product[arr.length*2];
        for (int i = 0; i< arr.length; i++){
            tempArray[i]= arr[i];
        }
        arr = tempArray;
    }
    public String toString(){
        String res="";
        for (int i=0;i<size;i++){
            res+= arr[i] +"\n";
        }
        return res;
    }
    public double sum(){
        double sum=0;
        for (int i = 0; i <size ; i++) {
            sum+=arr[i].priceOfDelivery() + arr[i].getPrice();
        }
        return sum;
    }

}
