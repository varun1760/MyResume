package com.resume.classes;

public class MyData {
	public void showProfileSummary() {
		Professional professional = new Professional();
		professional.profile();
	}

	public void showAcademics() {
		Professional professional = new Professional();
		professional.academics();
	}

	public void showSkills() {
		Professional professional = new Professional();
		professional.skills();
	}

	public void showCertifications() {
		Professional professional = new Professional();
		professional.certificates();
	}

	public void showProjects() {
		Professional professional = new Professional();
		professional.projects();
	}

	public void showSocials() {
		Professional professional = new Professional();
		professional.socialProfiles();
	}

	public void showPersonalDetails() {
		Personal personal = new Personal();
		personal.details();
	}

	public void showContacts() {
		Personal personal = new Personal();
		personal.contacts();
	}

	public void showLanguages() {
		Personal personal = new Personal();
		personal.languages();
	}

	public void showHobbies() {
		Personal personal = new Personal();
		personal.hobbies();
	}
}
