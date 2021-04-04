package com.car.shop.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.shop.model.Product;
import com.car.shop.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping()
	public List<Product> listProduct(){
		return productService.listProducts();
	}
	
	@GetMapping("/sale")
	public List<Product> listProductSale(){
		return productService.listProductSale();
	}
	
	
	@PostMapping("/create")
	public Product create(@RequestBody Product product) {
		return productService.create(product);
	}
	
	@PutMapping("/update/{idProduct}")
	public Product update(@RequestBody Product product, @PathVariable Long idProduct) {
		return productService.update(idProduct, product);
	}
	
	@DeleteMapping("/delete/{idProduct}")
	public Boolean delete(@PathVariable Long idProduct) {
		return productService.delete(idProduct);
	}
	
}
