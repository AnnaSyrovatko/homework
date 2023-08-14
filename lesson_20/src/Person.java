public class Person {
    private String name;
    private int id;
    private static int counter = 0;

    public Person(String name){
        counter ++;
        this.name = name;
        this.id = counter;
    }
    public String toString(){
        return id + "." + name;
    }
    public int getId(){
        return id;
    }

}
