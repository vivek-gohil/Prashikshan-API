package com.prashikshan.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "trainer_master")
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer trainerId;

    private String firstName;
    private String lastName;
    private Double perDayRate;
    private String trainerDescription;
    private String trainerStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_file_id")
    private FileMaster profileFile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trainer_contact_id")
    private Contact contact;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "banking_id")
    private Banking banking;
}

