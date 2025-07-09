package com.prashikshan.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashikshan.main.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserIdAndPassword(Integer userId, String password);
}
