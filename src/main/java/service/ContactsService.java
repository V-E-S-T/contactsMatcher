package service;

import model.Contact;

import java.util.List;

public interface ContactsService {

    List<Contact> findAllByIdIsBetween(int beginId, int endId);
}
