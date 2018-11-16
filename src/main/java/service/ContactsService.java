package service;

import model.Contact;


import java.util.List;
import java.util.function.Predicate;

public interface ContactsService {

    List<Contact> findMatchesContacts(int page, Predicate<Contact> filter);
}
