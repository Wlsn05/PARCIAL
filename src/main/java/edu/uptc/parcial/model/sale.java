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
@Table(name = "sales")
public class sale {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "saleID")
	private int saleID;
	
	@Column(name = "saleDate")
	private String saleDate;
	
	@Column(name = "customerID")
	private String customerID;
	
	
	@Column(name = "totalAmount")
	private String totalAmount;
	
	@Column(name = "discountAmount")
	private String discountAmount;
	
	@Column(name = "taxAmount")
	private String taxAmount;
	
	
	@Column(name = "netAmount")
	private String netAmount;
	
	
	@Column(name = "productID")
	private String productID;

}
