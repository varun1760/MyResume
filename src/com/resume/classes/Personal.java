package com.resume.classes;

public class Personal {
	private final String name = "Varun Kumar Rao";
	private final String dob = "20 July, 1993";
	private final String gender = "Male";
	private final String maritalStatus = "Single";
	private final String nationality = "Indian";
	private final String address = "Mohali, Punjab, India. Pin: 140603";
	private final String mobile = "+91-7518642627";
	private final String email = "varunrao1760@gmail.com";
	
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
		System.out.println("English");
		System.out.println("Hindi");
	}

	public void hobbies() {
		System.out.println("Travelling: \"Mostly Hills, Waterfalls and sometimes Deserts.\"");
		System.out.println("Organizer: \"I like arrange and organize small parties and gatherings with decent decorations and games for fun.\"");
		System.out.println("Cooking: \"I also like to cook sometimes mostly non-veg. I learn from youtube. Its safe to say that I am a begginer.\"");
		System.out.println("Sports: \"I was trained as a green belt Martial artist in Teakwondo back in high school. Now I enjoy playing Cricket and Badmintons with my friends.\"");
		System.out.println("Writing: \"I like to write poem sometimes. I also have made my blog for that but i am not a regular ones. Just a curiosity in freetime which is hard to get these days.\"");
	}
}
