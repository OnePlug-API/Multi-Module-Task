package pensionDto;


import lombok.Data;
import pension.PensionHolderTransaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class PensionDto {

    private String companyName;
    private String pensionNumber;
    private BigDecimal pensionBalance;
    private List<PensionHolderTransaction> transactions = new ArrayList<>();
}
