package com.ibm.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ibm.model.Address;
import com.ibm.model.Persion;
import com.ibm.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		// get SessionFactory
		SessionFactory factory = HibernateUtil.getSessionFactory();

		// get Session from SessionFactory
		Session session = factory.openSession();

		// Begin Tranjection
		Transaction tx = session.beginTransaction();

		// create Persion model data
		Persion persion = new Persion();
		persion.setFirstName("John");
		persion.setLastName("KC");
		persion.setAge(28);
		persion.setEducation("Graduation");

		// create Address Model data
		Address currentAdd = new Address();
		currentAdd.setStreet("Royel Road");
		currentAdd.setCity("NewYork");
		currentAdd.setZipcode("10001");

		// Associate Persion to current Address
		currentAdd.setPersion(persion);

		// create address model2
		Address permanentAdd = new Address();
		permanentAdd.setStreet("Bankura Road");
		permanentAdd.setCity("Bankura");
		permanentAdd.setZipcode("722122");

		// associated persion to permanant address
		permanentAdd.setPersion(persion);

		session.persist(persion);
		session.persist(currentAdd);
		session.persist(permanentAdd);

		// comitt the tranjection
		tx.commit();
		session.close();
		System.out.println("Successfull");
	}

}
