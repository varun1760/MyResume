package com.resume.classes;

import java.util.Scanner;

import com.resume.file.CreateFiles;
import com.resume.file.DeleteFiles;
import com.resume.file.SearchFiles;

public class DataService implements MyData{
	Scanner scanner = new Scanner(System.in);
	String fileName;
	Professional professional = new Professional();
	Personal personal = new Personal();

	public void createFile() {
		System.out.print("Enter Your File Name: ");
		fileName = scanner.nextLine();
		fileName = fileName + ".doc";
		
		CreateFiles create = new CreateFiles();
		create.fileCreation(fileName);
	}
	
	public void deleteFile() {
		System.out.print("Enter Your File Name: ");
		fileName = scanner.nextLine();
		fileName = fileName + ".doc";
		
		DeleteFiles delete = new DeleteFiles();
		delete.fileDeletion(fileName);
	}
	public void searchFile() {
		System.out.print("Enter location: ");
		String directory = scanner.nextLine();
		System.out.print("Enter Your File Name without .doc: ");
		fileName = scanner.nextLine();
		fileName = fileName + ".doc";
		SearchFiles search = new SearchFiles();
		search.fileFinder(directory, fileName);
	}

	@Override
	public void showProfileSummary() {
		professional.profile();
	}

	@Override
	public void showAcademics() {
		professional.academics();
	}

	@Override
	public void showSkills() {
		professional.skills();
	}

	@Override
	public void showCertifications() {
		professional.certificates();
	}

	@Override
	public void showProjects() {
		professional.projects();
	}

	@Override
	public void showSocials() {
		professional.socialProfiles();
	}

	@Override
	public void showPersonalDetails() {
		personal.details();
	}

	@Override
	public void showContacts() {
		personal.contacts();
	}
	@Override
	public void showLanguages() {
		personal.languages();
	}

	@Override
	public void showHobbies() {
		personal.hobbies();
	}
}
