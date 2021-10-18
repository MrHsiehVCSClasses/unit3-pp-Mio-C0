package u3pp;

import java.util.Scanner;

/**
 * Program takes year input from user and returns true or false if year is or isnt a leap year
 * 
 * @author Mio.C
 */

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year (or enter STOP to end): ");
		String input = sc.nextLine();

		while (!input.toUpperCase().equals("STOP")) {
			
			int yearInput = Integer.parseInt(input);

			if (LeapYear.isLeapYear(yearInput))
			{
				System.out.println(yearInput + " is a leap year");
			}
			else
			{
				System.out.println(yearInput + " is not a leap year");
			}

			System.out.print("Enter a year (or enter STOP to end): ");
			input = sc.nextLine();
		}
		sc.close();
	}
}