package com.car.shop.service;

import java.util.List;

import com.car.shop.model.Product;

public interface ProductService {

	List<Product> listProducts();
	List<Product> listProductSale();
	Product create(Product product);
	Product update(Long idProduct, Product product);
	Boolean delete(Long idProduct);
	
}
