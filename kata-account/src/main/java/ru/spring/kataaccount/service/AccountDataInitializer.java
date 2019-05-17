package ru.spring.kataaccount.service;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import ru.spring.kataaccount.dao.AccountDao;
import ru.spring.kataaccount.model.Account;

@Component
@Slf4j
@RequiredArgsConstructor
public class AccountDataInitializer {

    private final AccountDao accountDao;

    @Value("${kata.account.amount:100}")
    private int accountAmount;

    @Value("${kata.account.default-balance:1000}")
    private long accountDefaultBalance;

    @Async
    @PostConstruct
    public void initData() {
        long count = accountDao.count();
        if (count == 0) {
            accountDao.saveAll(
                    IntStream.range(0, accountAmount)
                            .mapToObj(i -> new Account())
                            .peek(a -> a.setAmount(accountDefaultBalance))
                            .collect(Collectors.toList()));
            log.info(
                    "Accounts was created - '{}' with balance - '{}'.",
                    accountAmount,
                    accountDefaultBalance);

        } else {
            log.info(
                    "Not necessary to create init data accounts, already in database: '{}'.",
                    count);
        }
    }
}
