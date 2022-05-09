package com.resume.classes;

import java.util.Arrays;

public class Professional {
	private String summary = "An Engineering fresher searching for opportunity to work"
			+ " and learn more, with hands on technologies like Java, Spring-Boot MVC,"
			+ " Spring Data JPA, MySQL, Angular, Git Hub, Html5, CSS and Bootstrap.\n"
			+ " Currently Focusing to work as a \"Java Developer\" with some enhanced"
			+ " technologies like Spring-boot MVC, Spring Data JPA and MySQL.\n"
			+ "Please visit my Git-hub repository to know more about my skills on"
			+ " projects, on link mentioned below.\n"
			+ "https://github.com/varun1760?tab=repositories";
	private final String graduation = "Bachelor of technology in Computer Science and"
			+ " Engineering, from Lovely Professional University,"
			+ " Jalandhar, India, in 2020 with CGPA 6.06/10.";
	private final String seniorSecondary = "12th from Dayanand Inter College, Lucknow,"
			+ " Uttar Pradesh, India, in 2009 with 53.8%";
	private final String higherSecondary = "10th from R P J S S M HSS Tetari Bazar,"
			+ " Siddharth Nagar, Uttar Pradesh in 2007 with 65%";
	private String[] skills = {"Java", "Spring-MVC", "MySQL", "Angular", "Html and Html5",
			"CSS", "Bootstrap"};
	private String[] applications = {"Eclipse IDE", "VS Code", "MySQL Workbench",
			"Tomcat Server", "Postman", "H2-Database", "Jenkins"};
	private String[] projects = {"https://github.com/varun1760/SpringMVC-angular-Project.git",
			"https://github.com/varun1760/phase3-project.git",
			"https://github.com/varun1760/phase4-project2.git",
			"https://github.com/varun1760/Capstone-project.git",
			"https://github.com/varun1760/Phase2-Project.git",
			"https://github.com/varun1760/Phase1-Project.git"};
	private String[] certificates = {"Full Stack Java Developer by SimpliLearn (Pursuing).",
			"OOPS Using Java with Data-Structure by SimpliLearn.",
			"Become a back-end Expert by SimpliLearn.",
			"Front End Web Developer by SimpliLearn.",
			"Spring MVC and Advance Java Programming by SimpliLearn."};
	private String linkedin = "https://www.linkedin.com/in/varunrao1760/";
	private String github = "https://github.com/varun1760";
	
	public void profile() {
		System.out.println(summary);
	}

	public void academics() {
		System.out.println("Graduation: " + graduation + "\nSenior Secondary: "
				+ seniorSecondary + "\nHigher Secondary: " + higherSecondary);
	}

	public void skills() {
		System.out.println("Skills: " + Arrays.toString(skills));
		System.out.println("Applications: " + Arrays.toString(applications));
	}
	public void certificates() {
		System.out.println("Certificates:");
		for(int i = 0; i< certificates.length; i++){
			System.out.println((i+1) + ". " + certificates[i]);
		}
	}
	public void projects() {
		System.out.println("Projects:");
		for(int i = 0; i< projects.length; i++){
			System.out.println((i+1) + ". " + projects[i]);
		}
	}

	public void socialProfiles() {
		System.out.println("LinkedIn: " + linkedin + "\nGithub: " + github);
	}
}
