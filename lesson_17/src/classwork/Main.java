package classwork;

public class Main {
    public static void main(String[] args) {

        MyDate birthday = new MyDate(20,11,1942);
        Person person1 = new Person("Joe","Biden","800-433-7300", birthday); //вместо birthday - new MyDate(20,11,1942);
        Account account1 = new Account("DE1234567", 5000000, person1); // вместо person1 - new Person...

        System.out.println(account1);
    }

}
