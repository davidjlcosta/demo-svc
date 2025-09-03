package com.davidjlcosta.demo_svc.service;

import com.davidjlcosta.demo_svc.entity.Product;
import com.davidjlcosta.demo_svc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product create(Product product) {

        return productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {

        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product get(Long id) {

        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    @Override
    public Product update(Long id, Product productDetails) {

        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());

        return productRepository.save(product);
    }

    @Override
    public void delete(Long id) {

        productRepository.deleteById(id);
    }
}
