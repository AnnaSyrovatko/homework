package homework;

public class Main {
    public static void main(String[] args) {

        // 1-st car
        MyDate registrationDate1 = new MyDate(1,12, 2022);
        Engine engine1 = new Engine(249, "diesel");
        Car car1 = new Car("BMW","black","FZK7955", registrationDate1, engine1);
        System.out.println(car1);

        MyDate registrationDate2 = new MyDate(23,5, 2023);
        Engine engine2 = new Engine(670, "electric");
        Car car2 = new Car("Tesla","red","MT7854", registrationDate2, engine2);
        System.out.println(car2);

        System.out.println();
        System.out.println(car1.drive(car1.brand, car1.licensePlate));

        System.out.println();
        System.out.println(car1.stop(car1.brand, car1.licensePlate));






    }
}
