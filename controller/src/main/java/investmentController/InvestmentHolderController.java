package investmentController;

import accountDto.AccountDto;
import accountDto.AccountHolderDto;
import accountService.AccountService;
import investmentDto.InvestmentDto;
import investmentDto.InvestmentHolderDto;
import investmentService.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/investmentHolder")
public class InvestmentHolderController {

    @Autowired
    private InvestmentService investmentService;

    @PostMapping("/save")
    public String saveInvestment(@RequestBody InvestmentHolderDto investmentHolderDto, InvestmentDto investmentDto) {
        investmentService.saveInvestment(investmentHolderDto, investmentDto);

        return "Resource successfully added";
    }
}
