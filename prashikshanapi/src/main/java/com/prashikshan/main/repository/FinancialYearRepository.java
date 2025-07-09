package com.prashikshan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashikshan.main.entity.FinancialYear;

public interface FinancialYearRepository  extends JpaRepository<FinancialYear,Integer> {

}
