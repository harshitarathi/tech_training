package com.techment;


import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client2 {
	public static void main(String[] args) {
		Configuration app=new Configuration();
		app.configure("configuration.cfg.xml");

		SessionFactory factory=app.buildSessionFactory();
		Session priya=factory.openSession();
		Session kumar=factory.openSession();
		
		Transaction t=priya.beginTransaction();
		System.out.println("==================hql=================");
		Employee emp=priya.get(Employee.class, 1);
		if(emp!=null) {
		String hql="DELETE FROM emp60 "+"WHERE id=1";
		Query query=priya.createQuery(hql);
		int result=query.executeUpdate();
		System.out.println("added "+result);
	}
	}

}
