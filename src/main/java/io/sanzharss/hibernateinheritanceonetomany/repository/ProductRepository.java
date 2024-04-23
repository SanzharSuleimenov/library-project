package io.sanzharss.hibernateinheritanceonetomany.repository;

import io.sanzharss.hibernateinheritanceonetomany.domain.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
