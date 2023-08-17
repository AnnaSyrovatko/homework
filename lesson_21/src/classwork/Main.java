package classwork;

public class Main {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance(); // создание объекта
        Singleton instance2 = Singleton.getInstance();

        instance1.temp = 1;
        instance1.temp = 2;

        instance1.print();
        instance2.print();
        System.out.println(Singleton.MASSAGE);

        Singleton2 inst = Singleton2.INSTANCE; // объект есть, вызываем класс


    }
}
