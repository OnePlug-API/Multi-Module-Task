package com.oneplug.repository.investmentRepository;

import com.oneplug.model.investment.InvestmentHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentHolderRepository extends JpaRepository<InvestmentHolder, Long> {

}
