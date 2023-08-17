package new_project;

public class Student {
    private String name;
    private static int numberOfQuestions;

    static{
        numberOfQuestions = 0;
    }

    public Student(String name) {
        this.name = name;
    }
    public String toString() {
        return "Student " + name;
    }
    public void ask(){
        numberOfQuestions++;
        System.out.println(name + ": ask");

    }
    public static int getNumberOfQuestions() {
        return numberOfQuestions;
    }
}
