package com.oneplug.serviceTest.investmentHolderTest;


import com.oneplug.model.investment.InvestmentHolder;
import com.oneplug.model.investmentDto.InvestmentDto;
import com.oneplug.model.investmentDto.InvestmentHolderDto;
import com.oneplug.repository.investmentRepository.InvestmentHolderRepository;
import com.oneplug.service.investmentService.InvestmentServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class InvestmentServiceImplTest {


    @Mock
    private InvestmentHolderRepository investmentHolderRepository;

    @InjectMocks
    private InvestmentServiceImpl investmentService;
    private InvestmentHolderDto investmentHolderDto;
    private InvestmentDto investmentDto;
    private InvestmentHolder investmentHolder;

    @BeforeEach
    void setUp() {

        investmentHolderDto = new InvestmentHolderDto();
        investmentDto = new InvestmentDto();
        investmentHolder = new InvestmentHolder();

    }

    @Test
    void testInvestmentHolderService(){
        investmentService.saveInvestment(investmentHolderDto, investmentDto);
        verify(investmentHolderRepository).save(investmentHolder);
    }
}