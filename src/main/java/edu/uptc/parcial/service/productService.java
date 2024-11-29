package edu.uptc.parcial.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import edu.uptc.parcial.model.products;

public interface productService {

	
	public List<products> getAll();

	public products findById(@RequestBody int i);

	public void deleteProduct(@RequestBody int i);

	public products saveLibro(@RequestBody products prod);
}
