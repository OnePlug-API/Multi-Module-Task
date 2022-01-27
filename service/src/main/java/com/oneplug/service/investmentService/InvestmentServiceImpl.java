package com.oneplug.service.investmentService;

import com.oneplug.model.investment.Investment;
import com.oneplug.model.investment.InvestmentHolder;
import com.oneplug.model.investment.InvestmentHolderTransaction;
import com.oneplug.model.investmentDto.InvestmentDto;
import com.oneplug.model.investmentDto.InvestmentHolderDto;
import com.oneplug.repository.investmentRepository.InvestmentHolderRepository;
import com.oneplug.repository.investmentRepository.InvestmentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestmentServiceImpl implements InvestmentService{

    @Autowired
    private InvestmentHolderRepository investmentHolderRepository;

    @Autowired
    private InvestmentRepository investmentRepository;

    @Override
    public void saveInvestment(InvestmentHolderDto investmentHolderDto, InvestmentDto investmentDto) {

        InvestmentHolder investmentHolder = new InvestmentHolder();
        BeanUtils.copyProperties(investmentHolderDto, investmentHolder);

        investmentHolderRepository.save(investmentHolder);

        investmentHolderDto.getInvestments().forEach(a -> {
            Investment investment = new Investment();

            a.setFirstname(investmentHolder.getFirstname());
            a.setLastname(investmentHolder.getLastname());

            BeanUtils.copyProperties(a, investment);

            investmentRepository.save(investment);

            investmentDto.getTransactions().forEach(t -> {


                InvestmentHolderTransaction transaction = new InvestmentHolderTransaction();
                t.setAccountNumber(investment.getInvestmentNumber());

                BeanUtils.copyProperties(t, transaction);

                investment.getTransactions().add(transaction);

            });
        });
    }
}
