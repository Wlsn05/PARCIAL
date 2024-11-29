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
@Table(name = "customers")
public class customers {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CustomerID")
	private int customerID;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	
	@Column(name = "geneder")
	private String gender;
	
	@Column(name = "dateOfBirth")
	private String dateOfBirth;

}
