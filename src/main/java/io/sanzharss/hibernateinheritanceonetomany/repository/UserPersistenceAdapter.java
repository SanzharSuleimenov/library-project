package io.sanzharss.hibernateinheritanceonetomany.repository;

import io.sanzharss.hibernateinheritanceonetomany.domain.model.user.GuestUser;
import io.sanzharss.hibernateinheritanceonetomany.domain.model.user.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

@Repository
public class UserPersistenceAdapter {

  @PersistenceContext
  private EntityManager entityManager;

  public User getUserById(Long id) {
    TypedQuery<User> query = entityManager.createQuery(
        """
            select u from User u left join fetch u.products where u.id = :id
            """,
        User.class
    );
    return query.setParameter("id", id).getSingleResult();
  }
}
