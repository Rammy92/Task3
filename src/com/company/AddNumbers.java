package com.company;

import static com.company.Number.getX;


public class AddNumbers {

    public static void addNumbers() {


        int z = 0;
        boolean maxNumber = true;


        while (maxNumber) {

            z += getX();
            if (z <= 100) {
                System.out.println(z);
            } else {
                maxNumber = false;
            }

        }
    }

}
