package com.example.project.project.product;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String description;

    private double price;

    private String imageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotNull(message = "name required") String getName() {
        return name;
    }

    public void setName(@NotNull(message = "name required") String name) {
        this.name = name;
    }

    public @NotNull(message = "description") String getDescription() {
        return description;
    }

    public void setDescription(@NotNull(message = "description") String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice( double price) {
        this.price = price;
    }

    public @NotNull(message = "url") String getImageUrl() {
        return imageUrl;
    }

    @NotNull(message = "category required")
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public void setImageUrl(@NotNull(message = "url") String imageUrl) {
        this.imageUrl = imageUrl;


    }

    public Product(int id, String name, String description, double price, String imageUrl, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.category = category;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", imageUrl='" + imageUrl + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}