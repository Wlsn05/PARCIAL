package edu.uptc.parcial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uptc.parcial.model.products;
import edu.uptc.parcial.service.productService;



@RestController
@RequestMapping(value = "product")
public class ControllerProducts {

	
	@Autowired
	private productService product;
	
	
	@GetMapping("/getAll")
	public List<products> findAll(){
		return product.getAll();
	}
	
	
	@PostMapping("/save")
	public products save (@RequestBody products productAUX) {
		return product.saveLibro(productAUX);
	}
}
