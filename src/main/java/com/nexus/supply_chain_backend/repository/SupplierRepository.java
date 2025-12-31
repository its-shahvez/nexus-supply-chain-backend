package com.nexus.supply_chain_backend.repository;



import com.nexus.supply_chain_backend.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}