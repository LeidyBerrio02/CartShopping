package com.car.shop.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.shop.model.Person;
import com.car.shop.model.TypePerson;
import com.car.shop.service.PersonService;
import com.car.shop.service.TypePersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {

	//injection dependencies
	@Autowired
	private PersonService personService;
	
	@Autowired
	private TypePersonService typePersonService;
	
	@GetMapping()
	public List<Person> listAll(){
		return personService.listAll();
	}
	
	@GetMapping("/type")
	public List<TypePerson> listTypePerson(){
		return typePersonService.listTP();
	}
	
	@GetMapping("/clients")
	public List<Person> listClients(){
		return personService.listClients();
	}
	
	@GetMapping("/suppliers")
	public List<Person> listSuppliers(){
		return personService.listSuppliers();
	}
	
	@PostMapping("/create")
	public Person create(@RequestBody Person person) {
		return personService.create(person);
	}
	
	@PutMapping("update/{idPerson}")
	public Person update(@RequestBody Person person, @PathVariable Long idPerson) {
		return personService.update(idPerson, person);
	}
	
	@DeleteMapping("/delete/{idPerson}")
	public Boolean delete(@PathVariable Long idPerson) {
		return personService.delete(idPerson);
	}
}
