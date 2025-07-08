package com.example.project.project.productservices;



import com.example.project.project.exceptions.ProductnotfoundExecption;
import com.example.project.project.product.Product;
import com.example.project.project.resporitory.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class Productsservice {

    @Autowired
    private Productrepo repo;

    // Get all products
    public List<Product> getProducts() {
        return repo.findAll();
    }


    public Product getProductById(@PathVariable int id) {
        return repo.findById(id).orElseThrow(()->new ProductnotfoundExecption("product "+ id+"  notfoud"));
    }

    public void addProducts(List<Product> products) {
        repo.saveAll(products);
    }


    public void updateProduct(Product product) {
        repo.save(product);
    }

    // Delete product
    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
    public List<Product> searchProductsByName(String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }

}
