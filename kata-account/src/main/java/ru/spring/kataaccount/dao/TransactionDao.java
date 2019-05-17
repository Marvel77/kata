package ru.spring.kataaccount.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.spring.kataaccount.model.Transaction;

@Repository
public interface TransactionDao extends JpaRepository<Transaction, Long> {}
