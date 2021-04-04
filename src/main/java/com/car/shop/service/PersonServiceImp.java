package com.car.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.shop.model.Person;
import com.car.shop.repository.PersonRepository;

@Service
public class PersonServiceImp implements PersonService{

	//injection dependencies
	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public List<Person> listAll() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}
	
	@Override
	public List<Person> listClients() {
		// TODO Auto-generated method stub
		return personRepository.onlyClients();
	}

	@Override
	public List<Person> listSuppliers() {
		// TODO Auto-generated method stub
		return personRepository.onlySuppliers();
	}

	@Override
	public Person create(Person person) {
		// TODO Auto-generated method stub
		return personRepository.save(person);
	}
	

	@Override
	public Person update(Long idPerson, Person person) {
		Person personDB = personRepository.findById(idPerson).orElseGet(null);
		
		if(person != null) {
			personDB.setFirstName(person.getFirstName());
			personDB.setLastName(person.getLastName());
		}
		return personRepository.save(personDB);
	}
	
	@Override
	public Boolean delete(Long idPerson) {
		if(personRepository.existsById(idPerson)) {
			personRepository.deleteById(idPerson);
			return true;
		}
		return false;
	}

	


}
