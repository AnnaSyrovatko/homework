package homework;

public class Car {
    String brand;
    String color;
    String licensePlate;
    MyDate registrationDate;
    Engine engine;
    boolean flag = false;

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
    public String drive(String brand, String licensePlate){
        if (!flag){
            flag = true;
            System.out.println(engine.start());
            return brand + " " + licensePlate + " drove off";
        }else{
            return "The car is already driving";
        }
    }

    public String stop(String brand, String licensePlate){
        flag = false;
        System.out.println(engine.stop());
        return brand + " " + licensePlate + " stopped";
    }

}
