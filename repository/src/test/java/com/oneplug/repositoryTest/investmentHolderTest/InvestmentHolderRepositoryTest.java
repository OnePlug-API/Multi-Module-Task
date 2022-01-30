package com.oneplug.repositoryTest.investmentHolderTest;

import com.oneplug.model.account.AccountHolder;
import com.oneplug.model.investment.InvestmentHolder;
import com.oneplug.repository.investmentRepository.InvestmentHolderRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@EntityScan(basePackages = {"com.oneplug.*"})
@EnableJpaRepositories(basePackages = {"com.oneplug.*"})
@ContextConfiguration(classes = {com.oneplug.repository.investmentRepository.InvestmentHolderRepository.class})
class InvestmentHolderRepositoryTest {

    @Autowired
    private InvestmentHolderRepository investmentHolderRepository;

    private InvestmentHolder investmentHolder;
    @BeforeEach
    void setUp() {
        investmentHolder = new InvestmentHolder();
    }

    @Test
    void saveInvestmentHolder() {
        investmentHolderRepository.save(investmentHolder);
        InvestmentHolder fetchInvestmentHolder = investmentHolderRepository.findById(investmentHolder.getId()).get();
        Assertions.assertEquals(1, fetchInvestmentHolder.getId());
    }
}