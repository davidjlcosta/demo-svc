package com.davidjlcosta.demo_svc.service;

import com.davidjlcosta.demo_svc.entity.Product;

import java.util.List;

public interface ProductService {

    Product create(Product product);

    List<Product> getAll();

    Product get(Long id);

    Product update(Long id, Product productDetails);

    void delete(Long id);
}
