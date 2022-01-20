package accountService;

import accountDto.AccountDto;
import accountDto.AccountHolderDto;

public interface AccountService {

    void saveAccount(AccountHolderDto accountHolderDto, AccountDto accountDto);
}
