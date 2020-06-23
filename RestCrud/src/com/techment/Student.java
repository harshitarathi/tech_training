package com.techment;

public class Student {
	int roll_no;
	String name;
	String add;
	
	
	public Student() {
		super();
		
	}
	public Student(int roll_no, String name, String add) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.add = add;
	}
	public int getRoll_no() {
		return roll_no;
	}
	
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", add=" + add + "]";
	}
	

}
