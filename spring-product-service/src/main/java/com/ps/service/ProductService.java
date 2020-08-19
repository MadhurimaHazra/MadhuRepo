package com.ps.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ps.entity.Product;




@Service
public interface ProductService {
	
	
	public List<Product> getProductDetailsByName(String name);
	public Product getProductByproductId(int id);
	public List<Product> getProducts();
//	public Product addSingleProduct();


	

	
	
	

}
