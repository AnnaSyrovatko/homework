package task3;

public class Goods {

    private int id;
    private String name;
    private double price;

    public Goods(String name, double price, int id){
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String toString(){
        return id + "." + name + " - " + price + " USD";
    }

    public double getPrice(){
        return price;
    }
    public int getId(){
        return id;
    }


}
