package com.car.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.shop.model.TypePerson;
import com.car.shop.repository.TypePersonRepository;

@Service
public class TypePersonServiceImp implements TypePersonService{

	//inject 
	@Autowired
	private TypePersonRepository typePersonRepository;
	
	
	@Override
	public List<TypePerson> listTP() {
		// TODO Auto-generated method stub
		return typePersonRepository.findAll();
	}

}
