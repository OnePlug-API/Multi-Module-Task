package com.oneplug.multiModuleTest.repository;

import account.AccountHolder;
import accountRepo.AccountHolderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class AccountHolderRepositoryTest {


    @Autowired
    private AccountHolderRepository accountHolderRepository;

    private AccountHolder accountHolder;

    @BeforeEach
    void setUp() {
    }


}