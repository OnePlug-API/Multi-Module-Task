package accountController;

import accountDto.AccountDto;
import accountDto.AccountHolderDto;
import accountService.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accountHolder")
public class AccountHolderController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/save")
    public String saveAccount(@RequestBody AccountHolderDto accountHolderDto, AccountDto accountDto) {
        accountService.saveAccount(accountHolderDto, accountDto);

        return "Resource successfully added";
    }
}