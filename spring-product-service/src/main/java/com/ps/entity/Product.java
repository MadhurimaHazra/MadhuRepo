package com.ps.entity;
import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "product")
public class Product implements Serializable{
    @Id
    @GeneratedValue
    @Column(name = "product_id")
     private int id;
    
    
    @Column(name = "product_description")
    private String description;
     
    @Column(name = "product_name")
    private String name;
     
    @Column(name = "product_price")
    private double price;

	public Product(Integer id, String description, String name, double price) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", description=" + description + ", name=" + name + ", price=" + price + "]";
	}

	
     
    
     
    
 
         
}
	
	
	
	
	