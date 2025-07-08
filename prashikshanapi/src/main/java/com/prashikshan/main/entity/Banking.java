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
@Table(name = "banking_master")
public class Banking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bankingId;

    private String accountNumber;
    private String accountHoldersName;
    private String ifscCode;
    private String bankName;
    private String branchAddress;
    private String panCardNumber;
    private String aadharNumber;
    private String bankingDetailsStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pan_card_file_id")
    private FileMaster panCardFile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aadhar_file_id")
    private FileMaster aadharFile;
}
