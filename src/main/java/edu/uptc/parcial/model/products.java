package edu.uptc.parcial.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "products")
public class products {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ProductID")
	private int productID;
	
	@Column(name = "nameProduct")
	private String nameProduct;
	
	@Column(name = "descriptionProduct")
	private String descriptionProduct;
	
	
	@Column(name = "shortDescription")
	private String shortDescription;
	
	@Column(name = "sku")
	private String sku;
	
	@Column(name = "barcode")
	private String barcode;

}
