package com.resume.classes;

import java.util.Scanner;

public class MenuOption extends MyData{
	Scanner scanner = new Scanner(System.in);

	public void mainMenu() {
		int goThere = 0;
		do {
			switch (goThere) {
			case 0: {
				System.out.println();
				System.out.println("Please Select and Type your options given below:");
				System.out.println("***********************************");
				System.out.println(" 1 : Professional Informations.");
				System.out.println(" 2 : Personal Informations.");
				System.out.println(" 3 : Exit The Application.");

				goThere = scanner.nextInt();
				continue;
			}
			case 1: {
				firstMenu();
				goThere = 0;
				continue;
			}
			case 2: {
				secondMenu();
				goThere = 0;
				continue;
			}
			case 3: {
				System.out.println("Exiting the Application...");
				System.exit(0);
			}
			default: {
				System.out.println("Please enter a valid option");
				System.out.println();
				goThere = 0;
				continue;
			}
			}
		} while (true);
	}

	public void firstMenu() {
		int goHere = 0;
		do {
			switch (goHere) {
			case 0: {
				System.out.println();
				System.out.println("Please Select Information Options:");
				System.out.println("***********************************");
				System.out.println(" 1 : Profile Summary");
				System.out.println(" 2 : Academics.");
				System.out.println(" 3 : Skills.");
				System.out.println(" 4 : Certificates.");
				System.out.println(" 5 : Projects.");
				System.out.println(" 6 : Social Profiles.");
				System.out.println(" 7 : Main Menu");
				System.out.println(" 8 : Exit the Application");
				goHere = scanner.nextInt();
				continue;
			}
			case 1: {
				showProfileSummary();
				goHere = 0;
				continue;
			}
			case 2: {
				showAcademics();
				goHere = 0;
				continue;
			}
			case 3: {
				showSkills();
				goHere = 0;
				continue;
			}
			case 4: {
				showCertifications();
				goHere = 0;
				continue;
			}
			case 5: {
				showProjects();
				goHere = 0;
				continue;
			}
			case 6: {
				showSocials();
				goHere = 0;
				continue;
			}
			case 7: {
				mainMenu();
				break;
			}
			case 8: {
				System.out.println("Exiting the Application");
				System.exit(0);
			}
			default: {
				System.out.println("Please enter a valid option");
				System.out.println("OR");
				goHere = 0;
				continue;
			}
			}
		} while (true);
	}

	public void secondMenu() {
		int goHere = 0;
		do {
			switch (goHere) {
			case 0: {
				System.out.println();
				System.out.println("Please Select Information Options:");
				System.out.println("***********************************");
				System.out.println(" 1 : Personal Details.");
				System.out.println(" 2 : Contacts.");
				System.out.println(" 3 : Languages.");
				System.out.println(" 4 : Hobbies.");
				System.out.println(" 5 : Main Menu");
				System.out.println(" 6 : Exit the Application");
				goHere = scanner.nextInt();
				continue;
			}
			case 1: {
				showPersonalDetails();
				goHere = 0;
				continue;
			}
			case 2: {
				showContacts();
				goHere = 0;
				continue;
			}
			case 3: {
				showLanguages();
				goHere = 0;
				continue;
			}
			case 4: {
				showHobbies();
				goHere = 0;
				continue;
			}
			case 5: {
				mainMenu();
				break;
			}
			case 6: {
				System.out.println("Exiting the Application");
				System.exit(0);
			}
			default: {
				System.out.println("Please enter a valid option");
				System.out.println("OR");
				goHere = 0;
				continue;
			}
			}
		} while (true);
	}
}
