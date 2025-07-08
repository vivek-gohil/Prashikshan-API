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
@Table(name = "purchase_order_details")
public class PurchaseOrder {
    @Id
    private String purchaseOrderId;

    private Double amount;
    private LocalDate receivedDate;
    private String purchaseOrderStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "purchase_order_file_id")
    private FileMaster purchaseOrderFile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
}


