package com.car.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.shop.model.Sale;
import com.car.shop.service.SaleService;

@RestController
@RequestMapping("/api/sale")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@GetMapping()
	public List<Sale> list(){
		return saleService.listSale();
	}

	
	//hacer consultas inner join
}
