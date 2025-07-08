package com.prashikshan.main.entity;

import java.time.LocalDate;

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
@Table(name = "financial_year_master")
public class FinancialYear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer yearId;

    private LocalDate yearStartDate;
    private LocalDate yearEndDate;
}
