package com.springboot;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "category_tb2")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int category_id;
	private String category_name;
	private int category_stocks;

	@OneToOne(cascade = CascadeType.ALL)
	private Product product;

	public Category(int category_id, String category_name, int category_stocks, Product product) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.category_stocks = category_stocks;
		this.product = product;
	}

	public Category() {
		super();
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public int getCategory_stocks() {
		return category_stocks;
	}

	public void setCategory_stocks(int category_stocks) {
		this.category_stocks = category_stocks;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", category_name=" + category_name + ", category_stocks="
				+ category_stocks + ", product=" + product + "]";
	}

}
