package com.example.react.repositories;

import com.example.react.models.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ContactRepository extends MongoRepository<Contact,String> {
    public Contact findByNameAndPassword(String name, String password);
    @Override
    @Transactional
    public Contact save(Contact contact);
}
