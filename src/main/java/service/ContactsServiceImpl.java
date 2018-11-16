package service;

import model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ContactRepo;

import java.util.List;
import java.util.function.Predicate;

@Service
public class ContactsServiceImpl implements ContactsService{


    @Autowired
    private ContactRepo contactRepo;

    public List<Contact> getContactsBetween(int beginId, int endId){

        return contactRepo.findAllByIdIsBetween(beginId, endId);
    }

    @Override
    public List<Contact> findMatchesContacts(int page, Predicate<Contact> filter) {


        return null;
    }
}
