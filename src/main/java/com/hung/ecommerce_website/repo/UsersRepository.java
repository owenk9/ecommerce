package com.hung.ecommerce_website.repo;

import com.hung.ecommerce_website.entity.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByEmail(String email);
}

