package io.sanzharss.hibernateinheritanceonetomany.start;

import io.sanzharss.hibernateinheritanceonetomany.domain.model.product.Jacket;
import io.sanzharss.hibernateinheritanceonetomany.domain.model.product.Shoe;
import io.sanzharss.hibernateinheritanceonetomany.domain.model.user.GuestUser;
import io.sanzharss.hibernateinheritanceonetomany.repository.ProductRepository;
import io.sanzharss.hibernateinheritanceonetomany.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OnStart implements CommandLineRunner {

  private static final Logger log = LoggerFactory.getLogger(OnStart.class);
  @Autowired
  private ProductRepository productRepository;
  @Autowired
  private UserRepository userRepository;

  @Override
  public void run(String... args) throws Exception {
    GuestUser user = new GuestUser();
    user.setEmail("guest@gmail.com");
    user.setFirstName("Guest");
    user.setLastName("Guest");
    user.setGuestId("x23dd24s1");
    user = userRepository.save(user);
    Shoe shoe = new Shoe();
    shoe.setName("Shoe");
    shoe.setDescription("Shoe");
    shoe.setPrice(10.0);
    shoe.setSize(33);
    shoe.setUser(user);
    Long shoeId = productRepository.save(shoe).getId();

    log.info("Shoe: {}", productRepository.findById(shoeId));
    log.info("User: {}", userRepository.findById(user.getId()));

    Shoe fetchedShoe = (Shoe) productRepository.findById(shoeId).get();
    log.info("Fetched shoe: {}", fetchedShoe);
    GuestUser fetchedUser = (GuestUser) userRepository.findById(user.getId()).get();
    log.info("Guest user: {}", fetchedUser);

    Jacket jacket = new Jacket();
    jacket.setName("Jacket Gucci");
    jacket.setDescription("Gucci Man 2024");
    jacket.setColor("Red");
    jacket.setPrice(1110.0);
    jacket.setUser(user);
    jacket = productRepository.save(jacket);
    log.info("Jacket: {}", jacket);

    Jacket fetchedJacket = (Jacket) productRepository.findById(jacket.getId()).get();
    log.info("Fetched jacket: {}", fetchedJacket);

    GuestUser guestUser1 = (GuestUser) userRepository.findById(user.getId()).get();
    log.info("Guest user: {}", guestUser1);
  }
}
