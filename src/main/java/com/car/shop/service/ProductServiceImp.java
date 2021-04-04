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
	public Boolean delete(Long idProduct) {
		if(productRepository.existsById(idProduct)) {
			productRepository.deleteById(idProduct);
			return true;
		}
		return false;
	}

	@Override
	public Product update(Long idProduct, Product product) {
		Product productDB = productRepository.findById(idProduct).orElse(null);
		if(product != null){
			productDB.setNameProduct(product.getNameProduct());
			productDB.setCode(product.getCode());
			productDB.setPrice(product.getPrice());
			productDB.setQuantity(product.getQuantity());
		}
		
		return productRepository.save(productDB);
	}

	@Override
	public List<Product> listProductSale() {
		// TODO Auto-generated method stub
		return productRepository.productSale();
	}

}

