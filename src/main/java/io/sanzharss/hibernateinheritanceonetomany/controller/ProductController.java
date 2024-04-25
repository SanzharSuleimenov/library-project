package io.sanzharss.hibernateinheritanceonetomany.controller;

import io.sanzharss.hibernateinheritanceonetomany.domain.model.product.Product;
import io.sanzharss.hibernateinheritanceonetomany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @GetMapping("/{id}")
  public Product getProduct(@PathVariable Long id) {
    return productRepository.findById(id).orElse(null);
  }
}
