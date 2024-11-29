package edu.uptc.parcial.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import edu.uptc.parcial.model.customers;



public interface customerService {
	
	public List<customers> getAll();
	
	public customers findById(@RequestBody int i);
	
	public void deleteLibro(@RequestBody int i);
	
	public customers saveLibro(@RequestBody customers aux);
}
