package com.oneplug.service.accountService;

import com.oneplug.model.accountDto.AccountDto;
import com.oneplug.model.accountDto.AccountHolderDto;

public interface AccountService {

    void saveAccount(AccountHolderDto accountHolderDto, AccountDto accountDto);
}
