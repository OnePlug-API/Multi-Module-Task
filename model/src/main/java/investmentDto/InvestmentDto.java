package investmentDto;


import investment.InvestmentHolderTransaction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class InvestmentDto {

    private String companyName;
    private String investmentNumber;
    private BigDecimal investmentBalance;
    private List<InvestmentHolderTransaction> transactions = new ArrayList<>();
}
