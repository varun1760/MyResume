package com.resume.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.resume.classes.Personal;
import com.resume.classes.Professional;

public class CreateFiles {
	Scanner scanner = new Scanner(System.in);

	public void fileCreation(String name) {
		Professional pro = new Professional();
		Personal person = new Personal();

		try {
			BufferedWriter f_writer = new BufferedWriter(new FileWriter(name));
			f_writer.write(person.toString() + "\n" + pro.toString());
			System.out.println("Resume file is created successfully with details.");
			f_writer.flush();
			f_writer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}