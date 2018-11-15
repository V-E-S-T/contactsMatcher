package repository;

import model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaRepo extends JpaRepository<Contact, Integer> {

    List<Contact> findAllByIdIsBetween(int beginId, int endId);

}
