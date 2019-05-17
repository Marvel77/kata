package ru.spring.kata.common.model;

public enum TransactionCommand {
    HOLD,
    HOLDED,
    PREPARE,
    PREPARED,
    DEPOSIT,
    DEPOSITED,
    CLEAN,
    CLEANED,
    REJECTED,
    REJECT,
    CANCEL,
    CANCELED,
}
