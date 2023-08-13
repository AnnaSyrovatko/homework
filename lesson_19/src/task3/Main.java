package task3;

public class Main {

    public static void main(String[] args) {
        /*
        Допустим, мы пишем on-line магазин. У нас есть класс Товар ( придумайте, какие поля должны быть).
        Реализуйте класс Корзинка, в которую можно добавить несколько товаров.
        Реализовать метод добавления и добавления товара в корзину.
        Реализовать метод, который распечатает весь заказ. Реализовать метод, который вернет сумму заказа.
        */

        Goods item1 = new Goods("Milk", 0.90);
        Goods item2 = new Goods("Bread", 2.12);
        Goods item3 = new Goods("Eggs", 2.46);
        Goods item4 = new Goods("Sugar", 1.3);
        Goods item5 = new Goods("Salt", 0.91);


        Cart client1 = new Cart();
        client1.add(item1);
        client1.add(item2);
        System.out.println(client1);
        System.out.println(client1.getTotalPrice());

    }

}
