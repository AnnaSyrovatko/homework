package task1;

public class Student {
    String firstName;
    String lastName;
    MyDate birthday;
    String group;
    MyDate startCourse;


    public String studentToString() {
        return firstName + " " + lastName + "\n" + birthday.toString() + "\n" + group + "\n" + startCourse.toString() + "\n";

    }

    public void sayHello(){
        System.out.println("Hello, my name " + firstName + " " + lastName + "!");
        System.out.println();
    }
}


