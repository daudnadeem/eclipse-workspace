package com.qa.Hospital;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int menuChoice;

		boolean quit = false;

		do {
			System.out.println("########################################################");
			System.out.println("############### WELCOME TO MY HOSPITAL #################");
			System.out.println("########################################################");
			System.out.println("Here are your options:");
			System.out.println("1. I am a Doctor");
			System.out.println("2. I am a Nurse");
			System.out.println("3. I am a Patient");
			System.out.println("4. I am a Receptionist");
			System.out.println("5. I am an Admin");
			System.out.println("6. I am none of the above");
			
			menuChoice = sc.nextInt();
			switch (menuChoice) {
			case 1:
				System.out.println("Doctah");
				break;

			case 2:
				System.out.println("Nurse");
				break;

			case 3:
				System.out.println("Patient");
				break;

			case 4:
				System.out.println("Receptionist");
				break;

			case 5:
				System.out.println("Admin");
				break;

			case 6:
				quit = true;
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (!quit);

	}
}
