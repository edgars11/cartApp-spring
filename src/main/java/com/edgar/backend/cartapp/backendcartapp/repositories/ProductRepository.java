package com.edgar.backend.cartapp.backendcartapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.edgar.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product , Long> {

    
}
