package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Student;
import model.StudentLogic;
/**
 * @author Joe Shilkaitis - jshilkaitis
 * CIS175 - Fall 2022
 * Sep 7, 2022
 */
public class TestStudentExperience {

	StudentLogic sl = new StudentLogic();
	Student student = new Student();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStudentIsBeginner() {
		student.setBeltColor("White");
		sl.setExperienceLevel(student);
		assertEquals("Beginner", student.getLevel());
	}

	@Test
	public void testStudentIsNovice() {
		student.setBeltColor("Green");
		sl.setExperienceLevel(student);
		assertEquals("Novice", student.getLevel());
	}

	@Test
	public void testStudentIsIntermediate() {
		student.setBeltColor("Brown");
		sl.setExperienceLevel(student);
		assertEquals("Intermediate", student.getLevel());
	}

	@Test
	public void testStudentIsAdvanced() {
		student.setBeltColor("Black");
		sl.setExperienceLevel(student);
		assertEquals("Advanced", student.getLevel());
	}

	@Test
	public void testStudentHasNoExperience() {
		student.setBeltColor("");
		sl.setExperienceLevel(student);
		assertEquals("No experience", student.getLevel());
	}
}
