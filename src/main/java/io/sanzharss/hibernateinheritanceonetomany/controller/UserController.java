package io.sanzharss.hibernateinheritanceonetomany.controller;

import io.sanzharss.hibernateinheritanceonetomany.domain.model.user.User;
import io.sanzharss.hibernateinheritanceonetomany.repository.UserPersistenceAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserPersistenceAdapter userPersistenceAdapter;

  @GetMapping("/{id}")
  public User getUser(@PathVariable Long id) {
    return userPersistenceAdapter.getUserById(id);
  }
}
