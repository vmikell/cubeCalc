package com.company;


import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		System.out.println("This program allows you to take two numbers and perform a mathematical operation.");
		int number1, number2, choice;
		Scanner scanner = new Scanner(System.in);
		do {

			System.out.println("Please enter your first number below. Then press enter. ");
			number1 = scanner.nextInt();
			System.out.println("Your first number selection is: " + number1);
			System.out.println("Now enter your second number, and press enter. ");
			number2 = scanner.nextInt();
			System.out.println("Your second number selection is: " + number2);

			System.out.println("""

				Please choose an operation:
				1 - Add\s
				2 - Subtract\s
				3 - Divide\s
				4 - Multiply\s
				5 - Exit""");

			System.out.println("Enter Operation Choice: ");
			choice = scanner.nextInt();

			System.out.println("You choices are listed below:");
			System.out.println("Number1 " + number1);
			System.out.println("Number2 " + number2);
			System.out.println("Choice " + choice + "\n");

			performOperationUsingSwitch(number1, number2, choice);

		}while(choice>=1 && choice<=4);

	}

	private static void performOperationUsingNestedIfElse(int number1, int number2, int choice) {
		if (choice == 1) {
			System.out.println("The sum of your numbers is" + (number1 + number2));
		} else if (choice == 2) {
			System.out.println("The difference of your numbers is" + (number1 - number2));
		} else if (choice == 3) {
			System.out.println("The divisor of your numbers is: " + (number1 / number2));
		} else if (choice == 4) {
			System.out.println("The product of your numbers is: " + (number1 * number2));
		} else {
			System.out.println("Good Bye!");
		}
	}
	private static void performOperationUsingSwitch(int number1, int number2, int choice) {
			switch(choice){
				case 1 : System.out.println("The sum of your numbers is: " + (number1 + number2) + "\n"); break;
				case 2 : System.out.println("The difference of your numbers is: " + (number1 - number2) + "\n"); break;
				case 3 : System.out.println("The divisor of your numbers is: " + (number1 / number2) + "\n"); break;
				case 4 : System.out.println("The product of your numbers is: " + (number1 * number2) + "\n"); break;
				default : System.out.println("Thanks for playing. Good Bye!" + "\n");
			}



	}


}
