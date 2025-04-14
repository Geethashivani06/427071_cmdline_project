package com.example.Paymentapp.dao;

import com.example.Paymentapp.Entity.TransactionEntity;
import com.example.Paymentapp.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Integer> {
    List<TransactionEntity> findByUser(UserEntity user);
}
