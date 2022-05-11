package com.resume.classes;

import java.util.Arrays;

public class Personal {
	private final String name = "Varun Kumar Rao";
	private final String dob = "20 July, 1993";
	private final String gender = "Male";
	private final String maritalStatus = "Single";
	private final String nationality = "Indian";
	private final String address = "Mohali, Punjab, India. Pin: 140603";
	private final String mobile = "+91-7518642627";
	private final String email = "varunrao1760@gmail.com";
	private String languages[] = {"English", "Hindi"};
	private String hobbies[] = {"Travelling: \"Mostly Hills, Waterfalls and sometimes Deserts.\"",
	"Organizer: \"I like arrange and organize small parties and gatherings with decent decorations and games for fun.\"",
	"Cooking: \"I also like to cook sometimes mostly non-veg. I learn from youtube. Its safe to say that I am a begginer.\"",
	"Sports: \"I was trained as a green belt Martial artist in Teakwondo back in high school. Now I enjoy playing Cricket and Badmintons with my friends.\"",
	"Writing: \"I like to write poem sometimes. I also have made my blog for that but i am not a regular ones. Just a curiosity in freetime which is hard to get these days.\""
	};
	public void details() {
		System.out.println("Name: " + name);
		System.out.println("Date Of Birth: " + dob);
		System.out.println("Gender: " + gender);
		System.out.println("Marital Status: " + maritalStatus);
		System.out.println("nationality: " + nationality);
		System.out.println("Address: " + address);
	}

	public void contacts() {
		System.out.println("Phone Number: " + mobile);
		System.out.println("E-mail: " + email);
	}

	public void languages() {
		System.out.println("Languages:");
		for(int i = 0; i < languages.length ; i++) {
			System.out.println((i+1) + ". " +languages[i]);
		}
	}

	public void hobbies() {
		System.out.println("Hobbies:");
		for(int i = 0; i < hobbies.length ; i++) {
			System.out.println((i+1) + ". " +hobbies[i]);
		}
	}

	@Override
	public String toString() {		
		return "Personal [\nName: " + name + ",\nDate Of Birth: " + dob + ",\nGender: " + gender 
				+ ",\nMaritalStatus: " + maritalStatus + ",\nNationality: " + nationality 
				+ ",\nAddress: " + address + ",\nMobile: " + mobile + ",\nEmail: " + email
				+ ",\nLanguage: " + Arrays.toString(languages) + ",\nHobby:\n" + Arrays.toString(hobbies) 
				+ "\n]\n";
	}
}
