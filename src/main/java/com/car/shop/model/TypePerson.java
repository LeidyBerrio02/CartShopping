package com.car.shop.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="typeperson")
@Table(name="typeperson")
public class TypePerson {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_type_person")
	private long idTypePerson;
	
	@Column(name="type_person")
	private String typePerson;
	
	@JsonIgnore
	@OneToMany(mappedBy = "typePerson", fetch = FetchType.LAZY)
	private List<Person> persons;

	public long getIdTypePerson() {
		return idTypePerson;
	}

	public void setIdTypePerson(long idTypePerson) {
		this.idTypePerson = idTypePerson;
	}

	public String getTypePerson() {
		return typePerson;
	}

	public void setTypePerson(String typePerson) {
		this.typePerson = typePerson;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	

}
