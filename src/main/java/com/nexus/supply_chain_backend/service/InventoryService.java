package com.nexus.supply_chain_backend.service;



import com.nexus.supply_chain_backend.entity.Product;
import com.nexus.supply_chain_backend.entity.Supplier;
import com.nexus.supply_chain_backend.repository.ProductRepository;
import com.nexus.supply_chain_backend.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private SupplierRepository supplierRepo;

    // Supplier Logic
    public Supplier addSupplier(Supplier supplier) {
        return supplierRepo.save(supplier);
    }

    public List<Supplier> getAllSuppliers() {
        return supplierRepo.findAll();
    }

    // Product Logic
    public Product addProduct(Product product, Long supplierId) {
        Supplier supplier = supplierRepo.findById(supplierId)
                .orElseThrow(() -> new RuntimeException("Supplier not found"));
        product.setSupplier(supplier);
        return productRepo.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
}