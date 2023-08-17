package classwork;

public class Singleton {
    public final static String MASSAGE = "This is final";
    public int temp;
    private static Singleton INSTANCE =null; // дефолтная переменная (объект статический и пустой)

    private Singleton(){ // приватный конструктор
    }

    public static Singleton getInstance(){ //  метод экземпляра класса (объект) - вместо конструктора
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
    public void print(){
        System.out.println(temp);
    }
}

