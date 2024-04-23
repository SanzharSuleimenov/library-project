package io.sanzharss.hibernateinheritanceonetomany.repository;

import io.sanzharss.hibernateinheritanceonetomany.domain.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
