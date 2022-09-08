package model;
/**
 * @author Joe Shilkaitis - jshilkaitis
 * CIS175 - Fall 2022
 * Sep 7, 2022
 */
public class StudentLogic {
	public boolean JrStudent(Student student) {
		boolean jr;
		int jrAge = 7;
		if (student.getAge() <= jrAge) {
			jr = true;
		} else {
			jr = false;
		}
		return jr;
	}

	public void setExperienceLevel(Student student) {
		if (student.getBeltColor().equalsIgnoreCase("White")) {
			student.setLevel("Beginner");
		} else if (student.getBeltColor().equalsIgnoreCase("Green")) {
			student.setLevel("Novice");
		} else if (student.getBeltColor().equalsIgnoreCase("Brown")) {
			student.setLevel("Intermediate");
		} else if (student.getBeltColor().equalsIgnoreCase("Black")) {
			student.setLevel("Advanced");
		} else
			student.setLevel("No experience");
	}

}
