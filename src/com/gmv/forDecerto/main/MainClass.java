package com.gmv.forDecerto.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springCFG.xml");
		ChemicProduct chemic = (ChemicProduct) ctx.getBean("chemic");
		EatingProduct eating = (EatingProduct) ctx.getBean("eating");
		Drawing draw = (Drawing) ctx.getBean("contactToCustomers"); // interface

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(chemic);
		session.save(eating);

		session.getTransaction().commit();
		session.close();
		draw.draw();
		draw.drawList();

	}
}
