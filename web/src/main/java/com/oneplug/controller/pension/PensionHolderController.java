package com.oneplug.controller.pension;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pensionDto.PensionDto;
import pensionDto.PensionHolderDto;
import pensionService.PensionService;

@RestController
@RequestMapping("/pensionUser")
public class PensionHolderController {

    @Autowired
    private PensionService pensionService;

    @PostMapping("/save")
    public String savePension(@RequestBody PensionHolderDto pensionHolderDto, PensionDto pensionDto){
        pensionService.savePension(pensionHolderDto, pensionDto);
        return "Pension-user is successfully saved";
    }
}
