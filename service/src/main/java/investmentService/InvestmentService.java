package investmentService;

import investmentDto.InvestmentDto;
import investmentDto.InvestmentHolderDto;

public interface InvestmentService {

    void saveInvestment(InvestmentHolderDto investmentHolderDto, InvestmentDto investmentDto);
}
