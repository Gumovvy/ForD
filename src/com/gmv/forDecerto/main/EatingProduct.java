package com.gmv.forDecerto.main;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class EatingProduct extends Product {

	private String kind;
	private String packageOfProduct;
	private int quantity;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getPackageOfProduct() {
		return packageOfProduct;
	}

	public void setPackageOfProduct(String packageOfProduct) {
		this.packageOfProduct = packageOfProduct;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	void draw() {
		System.out.println(getId() + getKind() + getName() + getPackageOfProduct() + getQuantity());
	}

}
