package io.sanzharss.hibernateinheritanceonetomany.domain.model.product;

import io.sanzharss.hibernateinheritanceonetomany.domain.model.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Data
@Entity
public abstract class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String description;
  private Double price;
  @Version
  private Integer version;
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "user_id")
  private User user;
}