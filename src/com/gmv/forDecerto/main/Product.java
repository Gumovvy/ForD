package com.gmv.forDecerto.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AddedProducts")
@DiscriminatorColumn(name = "typ_produktu", discriminatorType = DiscriminatorType.STRING)
public class Product {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "nazwa")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
