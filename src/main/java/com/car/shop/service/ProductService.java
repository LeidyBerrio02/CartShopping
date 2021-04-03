package com.car.shop.service;

import java.util.List;

import com.car.shop.model.Product;

public interface ProductService {

	List<Product> listProducts();
	Product create(Product product);
	Product search(Product product);
	Boolean delete(Long idProduct);
	
}
