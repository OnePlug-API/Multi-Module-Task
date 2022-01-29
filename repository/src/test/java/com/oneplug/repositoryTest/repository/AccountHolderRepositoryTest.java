package com.oneplug.repositoryTest.repository;

import com.oneplug.model.account.AccountHolder;
import com.oneplug.repository.accountRepository.AccountHolderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;



import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@ContextConfiguration(classes = {com.oneplug.repository.accountRepository.AccountHolderRepository.class})
class AccountHolderRepositoryTest {

    @Autowired
    private AccountHolderRepository accountHolderRepository;
    private AccountHolder accountHolder;
    @BeforeEach
    void setUp() {
        accountHolder = new AccountHolder();
    }
    @Test
    void saveAccountHolder() {
            accountHolderRepository.save(accountHolder);
            AccountHolder fetchAccountHolder = accountHolderRepository.findById(accountHolder.getId()).get();
            assertEquals(1, fetchAccountHolder.getId());
        }
}