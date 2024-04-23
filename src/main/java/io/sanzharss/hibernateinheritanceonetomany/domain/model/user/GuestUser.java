package io.sanzharss.hibernateinheritanceonetomany.domain.model.user;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Entity
public class GuestUser extends User {

  private String guestId;
}
