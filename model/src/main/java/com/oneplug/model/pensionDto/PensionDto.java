package com.oneplug.model.pensionDto;


import lombok.Data;
import com.oneplug.model.pension.PensionHolderTransaction;

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
