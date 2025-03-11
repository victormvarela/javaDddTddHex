package org.javadddtddhex.contact.infraestructure.controller;

import java.util.List;

import org.javadddtddhex.contact.application.service.ContactService;
import org.javadddtddhex.contact.domain.model.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contacts")
    public List<Contact> getContacts() {
        return contactService.getAllContacts();
    }
}