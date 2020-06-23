package com.techment.emp;

import java.util.*;

public class RepositoryEmp {
/*
 * creating a array list for employee details
 */
	static ArrayList<Employee> emplist=new ArrayList<Employee>();
/*
 * static block initializing the data
 */
	static{
		 emplist.add(new Employee (1,"arun","bsp",20000));
		 emplist.add(new Employee(2,"shobha","bhilai",19000));
		 emplist.add(new Employee(3,"guru","durg",50000));
		 
	}
/*
 * showing employee list	
 */
	public List<Employee> getAll(){
		return emplist;
		
	}
/*
 * adding new employee
 */
	public String addemployee(Employee emp) {
		emplist.add(emp);
		return "added emp details";
	}
	public String removeemployee(int emp_id) {
		Employee e=new Employee();
		if(emp_id==e.getEmp_id()) {
			emplist.remove(emp_id);
		return "deleted";
	}
		else
			return "not deleted";
	}
}
