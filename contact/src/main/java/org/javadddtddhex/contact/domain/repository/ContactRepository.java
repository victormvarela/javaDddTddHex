package org.javadddtddhex.contact.domain.repository;

import java.util.List;

import org.javadddtddhex.contact.domain.model.Contact;

public interface ContactRepository {
	List<Contact> findAll();
}
