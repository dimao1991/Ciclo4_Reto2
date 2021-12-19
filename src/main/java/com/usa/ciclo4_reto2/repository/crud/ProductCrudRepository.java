package com.usa.ciclo4_reto2.repository.crud;

import com.usa.ciclo4_reto2.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product, String> {
}
