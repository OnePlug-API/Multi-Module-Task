package com.oneplug.controller.investment;

import com.oneplug.model.investmentDto.InvestmentDto;
import com.oneplug.model.investmentDto.InvestmentHolderDto;
import com.oneplug.service.investmentService.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/investmentUser")
public class InvestmentHolderController {

    @Autowired
    private InvestmentService investmentService;

    @PostMapping("/save")
    public String saveInvestment(@RequestBody InvestmentHolderDto investmentHolderDto, InvestmentDto investmentDto){
        investmentService.saveInvestment(investmentHolderDto, investmentDto);
        return "Investment-user is successfully saved";
    }
}
