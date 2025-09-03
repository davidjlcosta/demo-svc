package com.davidjlcosta.demo_svc.repository;

import com.davidjlcosta.demo_svc.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
