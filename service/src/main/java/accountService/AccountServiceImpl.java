package accountService;

import account.Account;
import account.AccountHolder;
import account.AccountHolderTransaction;
import accountDto.AccountDto;
import accountDto.AccountHolderDto;
import accountRepo.AccountHolderRepository;
import accountRepo.AccountRepository;
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
