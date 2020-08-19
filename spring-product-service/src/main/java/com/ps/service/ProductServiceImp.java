package com.ps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ps.entity.Product;
import com.ps.repository.ProductRepository;


@Service
public class ProductServiceImp implements ProductService {

	
	@Autowired
	private ProductRepository productrepository;
	
	

	@Override
	public List<Product> getProductDetailsByName(String name) {
		List<Product> product=productrepository.findByProductName(name);
		if(product!=null) {
			return  product;
		}
		return null;
	}
	

	@Override
	public Product getProductByproductId(int id) {
		Product product=productrepository.findById(id).orElse(null);
		if(product!=null) {
			return product;
		}
		return null;
	}

	@Override
	public List<Product> getProducts() {
		return productrepository.findAll();
	}

//	@Override
//	public Product addSingleProduct() {
//		// TODO Auto-generated method stub
//		return 
//	}

	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
