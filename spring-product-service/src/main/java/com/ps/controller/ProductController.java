package com.ps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ps.entity.Product;
import com.ps.repository.ProductRepository;
import com.ps.service.ProductService;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductService productservice;

	@Autowired
	private ProductRepository productRepository;

	@ResponseBody
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}

	// Get all products
	@ResponseBody
	@GetMapping("/products")
	public List<Product> getAllproducts() {
		return productservice.getProducts();
	}

	// Get by Id
	@ResponseBody
	@GetMapping("/products/{id}")
	public Product getAllproductById(@PathVariable int id) {
		return productservice.getProductByproductId(id);
	}
	
	
	
	
	//get by name
	
	@ResponseBody
	@GetMapping("/products/name/{name}")
	public List<Product> getAllproductByName(@PathVariable String name) 
	{
		 return productservice.getProductDetailsByName(name);
		

	}

	
	
	
	
	
	


	// Post single product
	@ResponseBody
	@PostMapping("/products")
	public Product addProducts(@RequestBody Product products) {
		return productRepository.save(products);
	}

	// Post multiple products
	@ResponseBody
	@PostMapping("/products/all")
	public List <Product> addMultipleProducts(@RequestBody List <Product> products) {
		return productRepository.saveAll(products);
	}

}
