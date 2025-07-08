package com.example.project.project.controller;

import com.example.project.project.peoductdto.ProductDTO;
import com.example.project.project.product.Product;
import com.example.project.project.productservices.Productsservice;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/Product")
public class Productcontroller {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    Productsservice service;

    @GetMapping
    public List<ProductDTO> getProducts() {
        return service.getProducts()
                .stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .collect(Collectors.toList());
    }

    // Get product by ID
    @GetMapping("/{id}")
    public ProductDTO getProductById(@PathVariable int id) {
        return modelMapper.map(service.getProductById(id), ProductDTO.class);
    }

    // Add multiple products
    @PostMapping
    public String addProducts(@RequestBody List<ProductDTO> productDTOs) {
        service.addProducts(
                productDTOs.stream()
                        .map(product -> modelMapper.map(product, Product.class))
                        .collect(Collectors.toList())
        );
        return "Products added successfully";
    }

    // Update a product
    @PutMapping
    public String updateProduct(@RequestBody ProductDTO productDTO) {
        service.updateProduct(modelMapper.map(productDTO, Product.class));
        return "Product updated successfully";
    }

    // Delete a product
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        service.deleteProduct(id);
        return "Product deleted successfully";
    }

    // Search products by name
    @GetMapping("/search")
    public List<ProductDTO> searchProductsByName(@RequestParam String name) {
        return service.searchProductsByName(name)
                .stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .collect(Collectors.toList());
    }
}