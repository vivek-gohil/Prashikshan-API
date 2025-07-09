package com.prashikshan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashikshan.main.entity.Client;

public interface ClientRepository extends JpaRepository<Client,Integer> {

}
