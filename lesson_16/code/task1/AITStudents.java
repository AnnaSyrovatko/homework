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


        System.out.println(studentToString(student1));
        System.out.println(studentToString(student2));



    }
    public static String studentToString(Student student){
        return student.firstName +" "+ student.lastName +"\n"+  dateToStringWithObject(student.birthday) +"\n"+ student.group +"\n"+ dateToStringWithObject(student.startCourse) + "\n";
    }

    public static String dateToStringWithObject(MyDate date) {

        if (date.month < 0 || date.month > 12) {
            return "error";
        }

        String[] months = {"", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь" };
        return (date.day < 10 ? "0" : "") + date.day + " " + months[date.month] + " " + date.year;
    }

}
