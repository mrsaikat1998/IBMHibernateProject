package com.ibm.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ibm.model.Persion;
import com.ibm.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		
		Session session = factory.openSession();

		// Begin Tranjection
		Transaction tx = session.beginTransaction();

		// create Persion model data
		Persion persion = new Persion();
		persion.setFirstName("John");
		persion.setLastName("KC");
		persion.setAge(28);
		persion.setEducation("Graduation");

	}

}
