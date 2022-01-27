package com.oneplug.model.pensionDto;


import com.oneplug.model.account.AccountHolderContact;
import lombok.Data;
import com.oneplug.model.pension.Pension;

import java.util.ArrayList;
import java.util.List;

@Data
public class PensionHolderDto {

    private String NIN;
    private String pvcNumber;
    private String firstname;
    private String lastname;
    private String otherName;
    private String gender;
    private String maritalStatus;
    private AccountHolderContact contact;
    private List<Pension> pensions = new ArrayList<>();
}
