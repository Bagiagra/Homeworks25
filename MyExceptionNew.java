package by.overone.lesson25homework;

import java.io.IOException;

import java.util.Scanner;
//Task4
public class MyExceptionNew extends RuntimeException {
    public MyExceptionNew(String description) {
        super(description);
    }


    public static void main(String[] args) throws MyExceptionNew {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18 && age < 100) {
            System.out.println("You can get a bank loan");
        } else {
            throw new MyExceptionNew("Age is not acceptable");
        }

    }
}





