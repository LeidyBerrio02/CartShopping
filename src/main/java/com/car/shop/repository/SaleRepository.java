package com.car.shop.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.car.shop.model.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

	Optional<Sale> findById(Long idSale);
	
	@Query(value="select *\r\n"
			+ "from sale s \r\n"
			+ "inner join product_has_sale ps on s.id_sale = ps.sale_id_sale\r\n"
			+ "inner join product pr on pr.id_product = ps.product_id_product" , nativeQuery = true )
	List<Sale> listCompletSale();
	
}
