package com.oneplug.service.investmentService;

import com.oneplug.model.investmentDto.InvestmentDto;
import com.oneplug.model.investmentDto.InvestmentHolderDto;

public interface InvestmentService {

    void saveInvestment(InvestmentHolderDto investmentHolderDto, InvestmentDto investmentDto);
}
