package com.car.shop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.car.shop.model.TypePerson;

@Repository
public interface TypePersonRepository extends JpaRepository<TypePerson, Long> {

	Optional<TypePerson> findById(Long idTypePerson);
	
}
