package ru.spring.kataaccount.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.spring.kataaccount.dao.AccountDao;
import ru.spring.kataaccount.model.Account;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class AccountRestController {

    private final AccountDao accountDao;

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return accountDao.findAll();
    }
}
