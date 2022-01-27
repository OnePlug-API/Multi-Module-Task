package com.oneplug.model.pension;

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
public class Pension {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String firstname;
    private String lastname;
    @CreationTimestamp
    private LocalDateTime localDateTime;
    private String companyName;
    private String pensionNumber;
    private BigDecimal pensionBalance;
    private List<PensionHolderTransaction> transactions = new ArrayList<>();
}
