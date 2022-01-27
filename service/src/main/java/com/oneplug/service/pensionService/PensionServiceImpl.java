package com.oneplug.service.pensionService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oneplug.model.pension.Pension;
import com.oneplug.model.pension.PensionHolder;
import com.oneplug.model.pension.PensionHolderTransaction;
import com.oneplug.model.pensionDto.PensionDto;
import com.oneplug.model.pensionDto.PensionHolderDto;
import com.oneplug.repository.pensionRepository.PensionHolderRepository;
import com.oneplug.repository.pensionRepository.PensionRepository;

@Service
public class PensionServiceImpl implements PensionService{

    @Autowired
    private PensionHolderRepository pensionHolderRepository;

    @Autowired
    private PensionRepository pensionRepository;

    @Override
    public void savePension(PensionHolderDto pensionHolderDto, PensionDto pensionDto) {

        PensionHolder pensionHolder = new PensionHolder();
        BeanUtils.copyProperties(pensionHolderDto, pensionHolder);

        pensionHolderRepository.save(pensionHolder);

        pensionHolderDto.getPensions().forEach(a -> {
            Pension pension = new Pension();

            a.setFirstname(pensionHolder.getFirstname());
            a.setLastname(pensionHolder.getLastname());

            BeanUtils.copyProperties(a, pension);

            pensionRepository.save(pension);

            pensionDto.getTransactions().forEach(t -> {


                PensionHolderTransaction transaction = new PensionHolderTransaction();
                t.setPensionNumber(pension.getPensionNumber());

                BeanUtils.copyProperties(t, transaction);

                pension.getTransactions().add(transaction);

            });
        });
    }
}
