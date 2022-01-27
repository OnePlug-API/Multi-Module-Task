package com.oneplug.model.accountDto;

import com.oneplug.model.account.Account;
import com.oneplug.model.account.AccountHolderContact;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AccountHolderDto {
    private String NIN;
    private String pvcNumber;
    private String firstname;
    private String lastname;
    private String otherName;
    private String gender;
    private String maritalStatus;
    private AccountHolderContact contact;
    private List<Account> accounts = new ArrayList<>();
}
