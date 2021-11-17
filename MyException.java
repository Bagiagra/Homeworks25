package by.overone.lesson25homework;

import java.io.IOException;
import java.util.Scanner;

// Task3
public class MyException extends Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18 && age < 100) {
            System.out.println("You can get a bank loan");
        } else {
            try {
                throw new MyException();
            } catch (MyException e) {
                System.out.println("Age is not acceptable");
            }
        }
    }
}


