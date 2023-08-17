package homework;

public class Main {
    public static void main(String[] args) {
        Product[] array= {
                new Food("Bread", 2.5),
                new Food("Milk", 1.9),
                new Electronics("Video card", 390.5),
                new Electronics("SSD", 81.3),
                new Clothes("Dress", 4.2),
                new Clothes("Shoes", 3.6),
        };

        Cart cart = new Cart();
        cart.add(array[0]);
        cart.add(array[2]);
        cart.add(array[5]);
        System.out.println(cart);


        System.out.println("Total: " + cart.sum());



    }

}
