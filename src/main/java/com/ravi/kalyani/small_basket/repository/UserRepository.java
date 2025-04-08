package com.ravi.kalyani.small_basket.repository;

import com.ravi.kalyani.small_basket.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
