package com.prashikshan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashikshan.main.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice,String> {

}
