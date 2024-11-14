package com.edgar.backend.cartapp.backendcartapp.services;

import java.util.List;

import com.edgar.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductService {
    List<Product> findAll();
}
