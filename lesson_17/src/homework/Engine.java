package homework;

public class Engine {
    int power;
    String type;

    public Engine(int power, String type){
        this.power = power;
        this.type = type;
    }

    public String toString(){
        return type + ", " + power + " hp";
    }

    public String start(){
        return "Engine is started";
    }
    public String stop(){
        return "Engine is stopped";
    }

}
