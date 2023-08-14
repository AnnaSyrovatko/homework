package task3;

public class Main {

    public static void main(String[] args) {
        /*
        Допустим, мы пишем on-line магазин. У нас есть класс Товар ( придумайте, какие поля должны быть).
        Реализуйте класс Корзинка, в которую можно добавить несколько товаров.
        Реализовать метод добавления и добавления товара в корзину.
        Реализовать метод, который распечатает весь заказ. Реализовать метод, который вернет сумму заказа.
        */

        Goods [] array = {
                new Goods("Milk", 0.90, 1),
                new Goods("Bread", 2.12, 2),
                new Goods("Eggs", 2.46, 3),
                new Goods("Sugar", 1.3, 4),
                new Goods("Salt", 0.91, 5)
        };


        Cart client1 = new Cart();
        client1.add(array[0]);
        client1.add(array[1]);
        System.out.println(client1);
        System.out.println(client1.getTotalPrice());

        client1.removeByID(1);
        System.out.println(client1);

    }

}
