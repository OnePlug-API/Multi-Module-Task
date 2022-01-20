package accountDto;

import account.AccountHolderTransaction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class AccountDto {

    private String bankName;
    private String accountNumber;
    private String bvn;
    private String accountType;
    private BigDecimal accountBalance;
    private List<AccountHolderTransaction> transactions = new ArrayList<>();
}
