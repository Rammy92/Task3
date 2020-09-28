package com.company;

import java.util.Scanner;

import static com.company.GetScanner.getScanner;
import static com.company.Number.number;
import static com.company.AddNumbers.addNumbers;


public class Main {

    public static void main(String[] args) {
        Scanner sc = getScanner();
        number(sc);
        addNumbers();
    }


}