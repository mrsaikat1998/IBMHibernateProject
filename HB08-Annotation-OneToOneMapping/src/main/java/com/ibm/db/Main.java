package com.ibm.db;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ibm.model.Applicant;
import com.ibm.model.Passport;
import com.ibm.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();

		// get session factory using hibernate util class
		Session session = sf.openSession();

		// get session from sessionfactory
		Transaction t = session.beginTransaction();

		// create applicant model data
		Applicant applicant = new Applicant();
		applicant.setName("John");
		applicant.setAge(24);
		applicant.setCity("india");

		// create a passport model data
		Passport passport = new Passport();
		passport.setPassportNumber("AGFJ22543");
		passport.setIssuedDate(new Date());

		Calendar date = Calendar.getInstance();
		date.setTime(new Date());
		date.add(Calendar.YEAR, 10);
		passport.setExpiryDate(date.getTime());

		applicant.setPassport(passport);
		passport.setApplicant(applicant);
		session.persist(applicant);

		// commit transaction and close the session
		t.commit();
		System.out.println("successfully persisted applicant details");

	}

}