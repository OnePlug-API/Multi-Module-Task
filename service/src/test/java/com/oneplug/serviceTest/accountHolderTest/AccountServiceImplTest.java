package com.oneplug.serviceTest.accountHolderTest;

import com.oneplug.model.account.AccountHolder;
import com.oneplug.model.accountDto.AccountDto;
import com.oneplug.model.accountDto.AccountHolderDto;
import com.oneplug.repository.accountRepository.AccountHolderRepository;
import com.oneplug.service.accountService.AccountServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AccountServiceImplTest {

    @Mock
    private AccountHolderRepository accountHolderRepository;

    @InjectMocks
    private AccountServiceImpl accountService;
    private AccountHolderDto accountHolderDto;
    private AccountDto accountDto;
    private AccountHolder accountHolder;

    @BeforeEach
    void setUp() {
    accountHolderDto = new AccountHolderDto();
    accountDto = new AccountDto();
    accountHolder = new AccountHolder();

    }

    @Test
    void testAccountHolderService(){
        accountService.saveAccount(accountHolderDto, accountDto);
        verify(accountHolderRepository).save(accountHolder);
    }
}