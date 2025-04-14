package com.example.Paymentapp.services;

import com.example.Paymentapp.Entity.TransactionEntity;
import com.example.Paymentapp.Entity.UserEntity;
import com.example.Paymentapp.dao.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<TransactionEntity> getTransactionsByUser(UserEntity user) {
        return transactionRepository.findByUser(user);
    }
}