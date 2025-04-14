package com.example.Paymentapp.dao;

import com.example.Paymentapp.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByuserName(String userName);
}
