package org.javadddtddhex.contact.infraestructure.repository;

import java.util.List;

import org.javadddtddhex.contact.domain.model.Contact;
import org.javadddtddhex.contact.domain.repository.ContactRepository;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryContactRepository implements ContactRepository {
    @Override
    public List<Contact> findAll() {
        return List.of(new Contact("John Doe"), new Contact("Jane Smith"), new Contact("Michael Johnson"));
    }
}
