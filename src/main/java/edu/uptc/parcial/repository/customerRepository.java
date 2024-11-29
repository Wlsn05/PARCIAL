package edu.uptc.parcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uptc.parcial.model.sale;

public interface customerRepository extends JpaRepository<sale, Integer>{

}
