package com.example.crud.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data // Generates getters, setters, and constructors via Lombok
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private double price;
    private int quantity;
}
