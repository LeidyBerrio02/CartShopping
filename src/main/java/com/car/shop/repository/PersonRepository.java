package com.car.shop.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.car.shop.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

	@Query(value="select *\r\n"
			+ "from person c\r\n"
			+ "inner join typeperson t on t.id_type_person = c.type_person\r\n"
			+ "where t.type_person = 'client'", nativeQuery = true)
	List<Person> onlyClients();
	
	@Query(value="select *\r\n"
			+ "from person c\r\n"
			+ "inner join typeperson t on t.id_type_person = c.type_person\r\n"
			+ "where t.type_person = 'supplier'", nativeQuery = true)
	List<Person> onlySuppliers();
	
	Optional<Person> findById(long idPerson);
	
}
