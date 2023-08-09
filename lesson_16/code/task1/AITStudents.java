package task1;

public class AITStudents {

    public static void main(String[] args) {

        //Создать класс Student со следующими полями (String firstName, String lastName, MyDate birthday, String group, MyDate startCourse}
        //Создайте пару объектов этого класса. Напишите метод studentToString(Student student) который возвращает строку с данными студента.



        MyDate dateCourse = new MyDate();
        dateCourse.day = 18;
        dateCourse.month = 7;
        dateCourse.year = 2023;

        MyDate dateBirth1 = new MyDate();
        dateBirth1.day = 31;
        dateBirth1.month = 8;
        dateBirth1.year = 2000;

        Student student1 = new Student();
        student1.firstName = "Anna";
        student1.lastName = "Syrovatko";
        student1.birthday = dateBirth1;
        student1.group = "group 31.1";
        student1.startCourse = dateCourse;

        MyDate dateBirth2 = new MyDate();
        dateBirth2.day = 17;
        dateBirth2.month = 8;
        dateBirth2.year = 1996;

        Student student2 = new Student();
        student2.firstName = "Tyler";
        student2.lastName = "Durden";
        student2.birthday = dateBirth2;
        student2.group = "group 31.1";
        student2.startCourse = dateCourse;


        System.out.println(student1.studentToString());
        student1.sayHello();
        System.out.println(student2.studentToString());



    }

}
