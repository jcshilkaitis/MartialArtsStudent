package model;

/**
 * @author Joe Shilkaitis - jshilkaitis
 * CIS175 - Fall 2022
 * Sep 7, 2022
 */
public class Student {
	private String name;
	private int age;
	private String beltColor;
	private String level;

	public Student(String name, int age, String beltColor) {
		this.name = name;
		this.age = age;
		this.beltColor = beltColor;
	}

	public Student() {
		name = "Joe";
		age = 29;
		beltColor = "Black";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBeltColor() {
		return beltColor;
	}

	public void setBeltColor(String beltColor) {
		this.beltColor = beltColor;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}
