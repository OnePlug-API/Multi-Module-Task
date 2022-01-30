package com.oneplug.repositoryTest.pensionHolderTest;

import com.oneplug.model.investment.InvestmentHolder;
import com.oneplug.model.pension.PensionHolder;
import com.oneplug.repository.investmentRepository.InvestmentHolderRepository;
import com.oneplug.repository.pensionRepository.PensionHolderRepository;
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


@ExtendWith(SpringExtension.class)
@DataJpaTest
@EntityScan(basePackages = {"com.oneplug.*"})
@EnableJpaRepositories(basePackages = {"com.oneplug.*"})
@ContextConfiguration(classes = {com.oneplug.repository.pensionRepository.PensionHolderRepository.class})
class PensionHolderRepositoryTest {

    @Autowired
    private PensionHolderRepository pensionHolderRepository;

    private PensionHolder pensionHolder;
    @BeforeEach
    void setUp() {
        pensionHolder = new PensionHolder();
    }

    @Test
    void saveInvestmentHolder() {
        pensionHolderRepository.save(pensionHolder);
        PensionHolder fetchPensionHolder = pensionHolderRepository.findById(pensionHolder.getId()).get();
        Assertions.assertEquals(1, fetchPensionHolder.getId());
    }

}