package homework;

public class Food extends Product {
    public final double delivery = 15;
    public Food(String name, double price) {
        super(name, price);
    }
    public String toString() {
        return "Name: " + super.getName() + " \\ " + "Price: " + super.getPrice() + " (Price with delivery: " + (priceOfDelivery()+ super.getPrice()) + ")";
    }
    public double priceOfDelivery(){
        return delivery;
    }

}
