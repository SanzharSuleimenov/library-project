package io.sanzharss.hibernateinheritanceonetomany.domain.model.user;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Entity
public class HelpDeskUser extends User {

  private String department;
}
