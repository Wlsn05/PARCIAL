package edu.uptc.parcial.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;


import edu.uptc.parcial.model.sale;

public interface saleService  {

	
	public List<sale> getAll();
	
	public sale findById(@RequestBody int i);
	
	public void deleteSale(@RequestBody int i);
	
	public sale saveLibro(@RequestBody sale aux);

}
