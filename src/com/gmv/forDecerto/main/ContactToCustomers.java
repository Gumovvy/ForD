package com.gmv.forDecerto.main;

import javax.persistence.Embeddable;

@Embeddable
public class ContactToCustomers {
	String nameOFCustomer;
	int phone;

	public String getNameOFCustomer() {
		return nameOFCustomer;
	}

	public void setNameOFCustomer(String nameOFCustomer) {
		this.nameOFCustomer = nameOFCustomer;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
