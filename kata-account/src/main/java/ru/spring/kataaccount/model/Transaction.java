package ru.spring.kataaccount.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
import ru.spring.kata.common.model.TransactionState;

@Entity
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private Long sagaId;

    @Column(nullable = false)
    private Long amount;

    @Enumerated
    @Column(nullable = false)
    private TransactionState state;

    @ManyToOne(optional = false)
    private Account account;
}
