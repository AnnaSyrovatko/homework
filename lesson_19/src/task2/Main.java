package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumbersReader numbersReader = new NumbersReader();
        SmartArray numbers = numbersReader.read();
        System.out.println(numbers);
        NumbersHandler handler = new NumbersHandler(numbers);
        handler.printStart();

    }
}
