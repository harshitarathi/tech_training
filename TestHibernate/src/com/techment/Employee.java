package com.techment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp60")

public class Employee {
	@Id
			private int id;
	@Column(name="empname")
			private String name;
		
	private  String dept;
	
	@Override
	public String toString() {
		return "Emloyee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
			public Employee() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Employee(int id, String name, String dept) {
				super();
				this.id = id;
				this.name = name;
				this.dept = dept;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getDept() {
				return dept;
			}
			public void setDept(String dept) {
				this.dept = dept;
			}
			
	}

