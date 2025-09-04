package com.davidjlcosta.demo_svc.controller;

import com.davidjlcosta.demo_svc.entity.Product;
import com.davidjlcosta.demo_svc.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired private ProductService productService;

    @PostMapping
    public Product createProduct(@Valid @RequestBody Product product) {

        return productService.create(product);
    }

    @GetMapping
    public List<Product> listProduct() {

        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long id) {

        return productService.get(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product productDetails) {

        return productService.update(id, productDetails);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {

        productService.delete(id);
        return "Product deleted successfully";
    }
}
