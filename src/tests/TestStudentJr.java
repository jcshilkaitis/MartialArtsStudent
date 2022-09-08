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
public class TestStudentJr {

	StudentLogic sl = new StudentLogic();
	Student student = new Student();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStudenIsJr() {
		student.setAge(7);
		assertTrue(sl.JrStudent(student));
	}

	@Test
	public void testStudenIsNotJr() {
		student.setAge(8);
		assertFalse(sl.JrStudent(student));
	}

}
