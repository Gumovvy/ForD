package com.gmv.forDecerto.main;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Other implements InitializingBean, BeanNameAware, Drawing {
	private ContactToCustomers contact;
	private ContactToCustomers contact1;
	private ContactToCustomers contact2;
	private List<ContactToCustomers> contacts;

	public List<ContactToCustomers> getContacts() {
		return contacts;
	}

	public void setContacts(List<ContactToCustomers> contacts) {
		this.contacts = contacts;
	}

	public ContactToCustomers getContact1() {
		return contact1;
	}

	public void setContact1(ContactToCustomers contact1) {
		this.contact1 = contact1;
	}

	public ContactToCustomers getContact2() {
		return contact2;
	}

	public void setContact2(ContactToCustomers contact2) {
		this.contact2 = contact2;
	}

	public ContactToCustomers getContact() {
		return contact;
	}

	public void setContact(ContactToCustomers contact) {
		this.contact = contact;
	}

	public void draw() {
		System.out.println();
		System.out.println("Kontakt: " + contact.getNameOFCustomer() + " " + contact.getPhone());
		System.out.println("Kontakt: " + contact1.getNameOFCustomer() + " " + contact1.getPhone());
		System.out.println("Kontakt: " + contact2.getNameOFCustomer() + " " + contact2.getPhone());
	}

	public void drawList() {
		System.out.println();
		for (ContactToCustomers c : contacts) {
			System.out.println("Kontakt z listy: " + c.getNameOFCustomer() + " " + c.getPhone());
		}
	}

	public void cleanUP() throws Exception {
		System.out.println("Destroing");

	}

	public void myInit() throws Exception {
		System.out.println("Init by my init");

	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("Name bean: " + arg0);

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization by InitalizingBean ");

	}

}
