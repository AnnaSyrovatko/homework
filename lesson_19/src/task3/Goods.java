package task3;

public class Goods {
    private String name;
    double price; // can't make it private?

    public Goods(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return name + " - " + price + " USD";
    }


}
