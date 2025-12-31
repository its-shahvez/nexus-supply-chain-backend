package com.nexus.supply_chain_backend.controller;



import com.nexus.supply_chain_backend.entity.Product;
import com.nexus.supply_chain_backend.entity.Supplier;
import com.nexus.supply_chain_backend.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/inventory")
@CrossOrigin(origins = "*") //  for Frontend
public class InventoryController {

    @Autowired
    private InventoryService service;

    // --- Supplier Endpoints ---
    @PostMapping("/suppliers")
    public Supplier createSupplier(@RequestBody Supplier supplier) {
        return service.addSupplier(supplier);
    }

    @GetMapping("/suppliers")
    public List<Supplier> getSuppliers() {
        return service.getAllSuppliers();
    }

    // --- Product Endpoints ---
    @PostMapping("/products/{supplierId}")
    public Product createProduct(@RequestBody Product product, @PathVariable Long supplierId) {
        return service.addProduct(product, supplierId);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getAllProducts();
    }
}