package com.oneplug.model.account;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String firstname;
    private String lastname;
    @CreationTimestamp
    private LocalDateTime localDateTime;
    private String bankName;
    private String accountNumber;
    private String bvn;
    private String accountType;
    private BigDecimal accountBalance;
    private List<AccountHolderTransaction> transactions = new ArrayList<>();

}
