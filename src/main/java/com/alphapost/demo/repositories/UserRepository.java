package com.alphapost.demo.repositories;

import com.alphapost.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findUsersByUsername(String username);
    List<User> findUsersByEmail(String email);
}
