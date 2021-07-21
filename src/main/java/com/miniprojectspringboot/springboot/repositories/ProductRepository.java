package com.miniprojectspringboot.springboot.repositories;

import com.miniprojectspringboot.springboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
