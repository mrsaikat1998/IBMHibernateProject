package com.ibm.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ibm.model.Employee;
import com.ibm.util.HibernateUtil;

public class MergeExample {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session1 = factory.openSession();
		Employee employee1 = session1.get(Employee.class, new Integer(1));// load the employee details whose id is 1
		session1.close();

		Session session2 = factory.openSession();
		Employee employee2 = session2.get(Employee.class, new Integer(1));

		Transaction tx = session2.beginTransaction();
		System.out.println(employee1 == employee2);
		session2.merge(employee1);
		tx.commit();

	}

}
