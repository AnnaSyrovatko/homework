package homework;

public class Electronics extends Product {

    public Electronics(String name, double price){
        super(name, price);
    }
    public String toString() {
        return "Name: " + super.getName() + " \\ " + "Price: " + super.getPrice() + " " + provideWarranty();
    }
    public String provideWarranty(){
        return "(Warranty: 1 year)";
    }

}
