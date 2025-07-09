package com.prashikshan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashikshan.main.entity.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Integer> {

}
