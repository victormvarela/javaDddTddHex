package org.javadddtddhex.contact.application.service;

import java.util.List;

import org.javadddtddhex.contact.domain.model.Contact;
import org.javadddtddhex.contact.domain.repository.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}
