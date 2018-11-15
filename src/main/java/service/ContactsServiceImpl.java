package service;

import model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ContactRepo;

import java.util.List;

@Service
public class ContactsServiceImpl {


    @Autowired
    private ContactRepo contactRepo;

    public List<Contact> getContactsBetween(int beginId, int endId){

        return contactRepo.findAllByIdIsBetween(beginId, endId);
    }
}
