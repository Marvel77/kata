package ru.spring.kataaccount.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.spring.kataaccount.model.Account;

@Repository
public interface AccountDao extends JpaRepository<Account, Long> {

}
