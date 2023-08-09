package homework;

public class Car {
    String brand;
    String color;
    String licensePlate;
    MyDate registrationDate;
    Engine engine;

    public Car(String brand, String color, String licensePlate, MyDate registrationDate, Engine engine){
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
        this.registrationDate = registrationDate;
        this.engine = engine;
    }

    public String toString(){
        return brand + " " + color + " " + licensePlate + " (" + registrationDate + "); Engine: " + engine;
    }
}
