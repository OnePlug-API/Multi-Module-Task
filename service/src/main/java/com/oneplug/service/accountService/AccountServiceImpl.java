package com.oneplug.service.accountService;

import com.oneplug.model.account.Account;
import com.oneplug.model.account.AccountHolder;
import com.oneplug.model.account.AccountHolderTransaction;
import com.oneplug.model.accountDto.AccountDto;
import com.oneplug.model.accountDto.AccountHolderDto;
import com.oneplug.repository.accountRepository.AccountHolderRepository;
import com.oneplug.repository.accountRepository.AccountRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountHolderRepository accountHolderRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void saveAccount(AccountHolderDto accountHolderDto, AccountDto accountDto) {


        AccountHolder accountHolder = new AccountHolder();
        BeanUtils.copyProperties(accountHolderDto, accountHolder);

        accountHolderRepository.save(accountHolder);

        accountHolderDto.getAccounts().forEach(a -> {
            Account account = new Account();

            a.setFirstname(accountHolder.getFirstname());
            a.setLastname(accountHolder.getLastname());

            BeanUtils.copyProperties(a, account);

            accountRepository.save(account);

            accountDto.getTransactions().forEach(t -> {


                AccountHolderTransaction transaction = new AccountHolderTransaction();
                t.setAccountNumber(account.getAccountNumber());

                BeanUtils.copyProperties(t, transaction);

                account.getTransactions().add(transaction);

            });
        });
    }
}
