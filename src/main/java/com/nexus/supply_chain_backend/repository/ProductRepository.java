package com.nexus.supply_chain_backend.repository;



import com.nexus.supply_chain_backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}