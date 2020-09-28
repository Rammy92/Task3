package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Number {

    static int x;

    public static void number(Scanner sc) {
        boolean itsANumber = true;

        while (itsANumber) {
            try {
                System.out.println("Please enter a number");
                x = sc.nextInt();

                itsANumber = false;

            } catch (InputMismatchException e) {

                sc.nextLine();
                itsANumber = true;
            }

        }
    }

    public static int getX() {
        return x;
    }
}
