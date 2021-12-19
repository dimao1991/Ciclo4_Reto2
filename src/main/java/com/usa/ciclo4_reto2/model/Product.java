package com.usa.ciclo4_reto2.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "users")
public class Product {
    @Id
    private String reference;
    private String brand;
    private String category;
    private String presentation;
    private String description;
    private boolean availability;
    private double price;
    private Integer quantity;
    private String photography;

}
