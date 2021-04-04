package com.car.shop.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.car.shop.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product> findById(Long idProduct);
	
	@Query(value="select * from product p \r\n"
			+ "inner join product_has_sale ps on ps.product_id_product = p.id_product", nativeQuery = true)
	List<Product> productSale();
}

