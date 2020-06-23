package com.techment.emp;

public class Employee {
/*
 * declaring the elements of class employee	
 */
	int emp_id;
	String name;
	String add;
	int salary;
/*
 * default constructor
 */
public Employee() {
		super();
	}
/*
 * parameterised constructor
 */
public Employee(int emp_id, String name, String add, int salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.add = add;
		this.salary = salary;
	}
/*
 *getter and setter functions 
 */
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", add=" + add + ", salary=" + salary + "]";
	}
}
