package com.gmv.forDecerto.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import org.springframework.context.annotation.Description;

@Entity

public class ChemicProduct extends Product {
	@Column(name = "rodzaj")
	private String kind;
	@Column(name = "opakowanie")
	private String packageOfProduct;
	@Column(name = "ilosc")
	private int quantity;

	public ChemicProduct(String name, String kind, String packageOfProduct, int quantity) {
		setName(name);
		this.kind = kind;
		this.packageOfProduct = packageOfProduct;
		this.quantity = quantity;

	}

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
