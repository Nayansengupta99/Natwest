package com.nayan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nayan.model.TransactionModel;

public interface TransactionRepository extends JpaRepository<TransactionModel,Long>{

}
