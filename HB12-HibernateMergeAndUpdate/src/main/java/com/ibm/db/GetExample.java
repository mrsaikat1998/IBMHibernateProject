package com.ibm.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ibm.model.Employee;
import com.ibm.util.HibernateUtil;

public class GetExample {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		
		System.out.println("Calling session.get() method");
		
		session.get(Employee.class, new Integer(1));
		session.close();
		System.out.println("Close");

	}

}
