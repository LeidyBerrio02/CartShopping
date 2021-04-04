package com.car.shop.service;

import java.util.List;

import com.car.shop.model.Person;

public interface PersonService {

	List<Person> listAll();
	List<Person> listClients();
	List<Person> listSuppliers();
	Person create(Person person);
	Person update(Long idPerson, Person person);
	Boolean delete(Long idPerson);
	
}
