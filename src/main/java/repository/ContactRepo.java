package repository;

import model.Contact;

import java.util.List;

public interface ContactRepo {

    public List<Contact> findAllByIdIsBetween(int beginId, int endId);
}
