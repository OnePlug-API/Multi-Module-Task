package com.oneplug.model.investmentDto;

import com.oneplug.model.investment.Investment;
import com.oneplug.model.investment.InvestmentHolderContact;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class InvestmentHolderDto {

    private String NIN;
    private String pvcNumber;
    private String firstname;
    private String lastname;
    private String otherName;
    private String gender;
    private String maritalStatus;
    private InvestmentHolderContact contact;
    private List<Investment> investments = new ArrayList<>();
}
