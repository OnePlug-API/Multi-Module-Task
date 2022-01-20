package investmentService;

import investment.Investment;
import investment.InvestmentHolder;
import investment.InvestmentHolderTransaction;
import investmentDto.InvestmentDto;
import investmentDto.InvestmentHolderDto;
import investmentRepo.InvestmentHolderRepository;
import investmentRepo.InvestmentRepository;
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
