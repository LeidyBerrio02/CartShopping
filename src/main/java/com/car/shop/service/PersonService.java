package com.car.shop.service;

import java.util.List;

import com.car.shop.model.Person;

public interface PersonService {

	List<Person> listClients();
	List<Person> listSuppliers();
	Person create(Person person);
	Person search(Person person);
	Boolean delete(Long idPerson);
	
}
