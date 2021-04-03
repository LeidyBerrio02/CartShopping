package com.car.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.shop.model.Product;
import com.car.shop.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService{

	//Injection dependencies
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product search(Product product) {
		// TODO Auto-generated method stub
		return productRepository.findById(product.getIdProduct()).orElse(null);
	}

	@Override
	public Boolean delete(Long idProduct) {
		if(productRepository.existsById(idProduct)) {
			productRepository.deleteById(idProduct);
			return true;
		}
		return false;
	}

}
