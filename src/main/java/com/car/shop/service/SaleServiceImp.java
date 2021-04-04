package com.car.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.shop.model.Sale;
import com.car.shop.repository.SaleRepository;

@Service
public class SaleServiceImp implements SaleService{

	//injection dependencies
	@Autowired
	private SaleRepository saleRepository;
	
	@Override
	public List<Sale> listSale() {
		// TODO Auto-generated method stub
		return saleRepository.listCompletSale();
	}

}
