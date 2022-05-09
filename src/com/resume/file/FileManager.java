package com.resume.file;

import java.util.Scanner;

public class FileManager {
	Scanner scanner = new Scanner(System.in);
	String fileName;
	
	public void createFile() {
		System.out.print("Enter Your File Name: ");
		fileName = scanner.nextLine();
		fileName = fileName + ".docx";
		
		CreateFiles create = new CreateFiles();
		create.fileCreation(fileName);
	}
	
	public void deleteFile() {
		System.out.print("Enter Your File Name: ");
		fileName = scanner.nextLine();
		fileName = fileName + ".txt";
		
		DeleteFiles delete = new DeleteFiles();
		delete.fileDeletion(fileName);
	}
}