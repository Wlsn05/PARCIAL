package edu.uptc.parcial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uptc.parcial.model.customers;
import edu.uptc.parcial.service.customerService;





@RestController
@RequestMapping(value = "sale")
public class controllerSale {
	
	@Autowired
	private customerService customer;
	
	@GetMapping("/getAll")
	public List<customers> findAll(){
		return customer.getAll();
	}
	
	@PostMapping("/save")
	public customers save (@RequestBody customers customerAux) {
		return customer.saveLibro(customerAux);
	}

}
