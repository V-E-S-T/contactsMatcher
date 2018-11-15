package repository;

import model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactRepoImpl implements ContactRepo{

    @Autowired
    private JpaRepo repo;


     public List<Contact> findAllByIdIsBetween(int beginId, int endId){

         return repo.findAllByIdIsBetween(beginId, endId);
     }


}
