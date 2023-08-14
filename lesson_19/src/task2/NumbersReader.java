package task2;

import java.util.Scanner;

public class NumbersReader {
    public SmartArray read(){
        Scanner scanner = new Scanner(System.in);
        SmartArray array = new SmartArray();
        int number = 1;

        while (number != 0){
            System.out.println("Input integer: ");
            number = scanner.nextInt();
            array.add(number);
        }
        return array ;
    }
}
