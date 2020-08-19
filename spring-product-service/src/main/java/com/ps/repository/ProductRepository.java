package com.ps.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.ps.entity.Product;




public interface ProductRepository extends JpaRepository<Product, Integer> {

	
   @Query(value="select distinct product_id,product_name,product_description,product_price from product where product_name like %?1%",nativeQuery = true)
	List<Product> findByProductName(String name);

 
      
   
     
     
	
	
	
	
	
        
}
