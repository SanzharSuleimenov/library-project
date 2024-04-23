package io.sanzharss.hibernateinheritanceonetomany.domain.model.product;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Entity
public class Shoe extends Product {

  private int size;
}
