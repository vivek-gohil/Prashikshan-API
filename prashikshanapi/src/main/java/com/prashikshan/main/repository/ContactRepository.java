package com.prashikshan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashikshan.main.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

}
