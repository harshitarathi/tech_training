package com.techment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("configuration.cfg.xml");

		SessionFactory factory=cfg.buildSessionFactory();
		Session session1=factory.openSession();
		
		Transaction t=session1.beginTransaction();
		Employee e=new Employee();
		/*e.setId(2);
		e.setName("mohan");
		e.setDept("hr");
		
		
session1.persist(e);//it is in persistance state
		System.out.println("inserted............");
		
		t.commit();
		*/
		/*
		 * update
		 */
		Employee emp=session1.get(Employee.class,1);
		emp.setName("shanu");
		System.out.println(emp.getId()+emp.getName()+emp.getDept());
		t.commit();
		session1.close();
		/*Session session2=factory.openSession();
		Employee emp=session1.get(Employee.class,1);
		System.out.println(e.toString());
		t.commit();
		*/
	}
/*
 * hibernate object state:
 * ---------------------------------------
 * transicent state:it will be java object but does not represent any row in the table
 * 
 * persist state-
 */
}