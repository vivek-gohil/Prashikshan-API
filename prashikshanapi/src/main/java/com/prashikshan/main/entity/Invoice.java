package com.prashikshan.main.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@Table(name = "invoice_details")
public class Invoice {
    @Id
    private String invoiceId;

    private LocalDate raisedDate;
    private LocalDate clearingDate;
    private Double invoiceAmount;
    private String invoiceAmountInWords;
    private String invoiceStatus;
    private Double invoiceClearedAmount;
    private Double taxDeductedAmount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice_file_id")
    private FileMaster invoiceFile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;
}
