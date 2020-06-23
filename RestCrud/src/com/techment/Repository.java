package com.techment;

import java.util.ArrayList;
import java.util.List;

public class Repository {

	/*
	 * declare a static arraylist to store student details
	 */
	static ArrayList<Student> studentList = new ArrayList<Student>();

	/*
	 * static block to initialize data
	 */
	static {
		studentList.add(new Student(1, "saurav", "hr"));
		studentList.add(new Student(2, "ravi", "dev"));
		studentList.add(new Student(3, "gaurav", "hr"));

	}

	public List<Student> getAll() {
		return studentList;
	}

	public String add(Student student) {
		studentList.add(student);
		return "Student added";
	}

	public String deleteStudent(int id) {
		studentList.remove(id);
		return "student deleted";
	}

	public String update(Student student) {
		System.out.println("Before update");
		studentList.get(student.getRoll_no()).setName(student.getName());
		studentList.get(student.getRoll_no()).setAdd(student.getAdd());
		System.out.println("After update");
		return "student updated";
	}

}