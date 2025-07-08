package com.prashikshan.main.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "contact_master")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contactId;

    private String firstName;
    private String lastName;
    @Column(name = "contact_number_1")
    private String contactNumber1;
    @Column(name = "contact_number_2")
    private String contactNumber2;
    @Column(name = "email_1")
    private String email1;
    @Column(name = "email_2")
    private String email2;
    private String contactType;
    private String contactStatus;
}
