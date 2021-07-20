package com.company;

import java.util.Scanner;

public class CubePrinterRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = -1;
        System.out.println("let's find the cubes of positive numbers!");
        do {
            int cube = number * number * number;
            if ( number != -1 ) {
                System.out.println(number + " cubed is: " + cube);
            }
            System.out.print("Please enter a number to be cubed:");
            number = scanner.nextInt();
        } while ( number >= 0 );
        System.out.println("That's not a positive number! Game Over.");

    }
}





