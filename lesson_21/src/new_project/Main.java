package new_project;

public class Main {
    public static void main(String[] args) {
        Student[] students={
                new Student("Astarion"),
                new Student("Moria"),
                new Student("lae'zel"),
                new Student("Rick"),
                new Student("Ann")
        };

        for (Student i: students) {
            i.ask();
        }

        students[1].ask();
        students[1].ask();

        System.out.println(Student.getNumberOfQuestions());
    }

}
