package com.oneplug.model.investment;


import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Data
@Entity
public class InvestmentHolderContact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String phoneNumber;
    private String email;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToOne
    private InvestmentHolderAddress address;
}
