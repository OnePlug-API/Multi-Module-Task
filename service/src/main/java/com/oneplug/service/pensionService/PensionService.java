package com.oneplug.service.pensionService;


import com.oneplug.model.pensionDto.PensionDto;
import com.oneplug.model.pensionDto.PensionHolderDto;

public interface PensionService {

    void savePension(PensionHolderDto pensionHolderDto, PensionDto pensionDto);
}
