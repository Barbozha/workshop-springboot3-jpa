package com.barbozha.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbozha.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
