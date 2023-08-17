package homework;

public class Clothes extends Product {
    public Clothes(String name, double price) {
        super(name, price);
    }
    public String toString() {
        return "Name: " + super.getName() + " \\ " + "Price: " + super.getPrice();
    }
}
