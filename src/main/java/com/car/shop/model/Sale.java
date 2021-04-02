package com.car.shop.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity(name="sale")
@Table(name="sale")
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_sale")
	private Long idSale;
	
	@Column(name="date_sale")
	private Date dateSale;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="client")
	private Person person;
	
	@ManyToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	@JoinTable(name="product_has_sale",
		joinColumns = { @JoinColumn(name="product_id_product") },
		inverseJoinColumns = { @JoinColumn(name="sale_id_sale") }
			)
	private List<Product> products;

	public Long getIdSale() {
		return idSale;
	}

	public void setIdSale(Long idSale) {
		this.idSale = idSale;
	}

	public Date getDateSale() {
		return dateSale;
	}

	public void setDateSale(Date dateSale) {
		this.dateSale = dateSale;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	

}
