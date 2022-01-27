package com.oneplug.model.account;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Data
@Entity
public class AccountHolderContact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String phoneNumber;
    private String email;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToOne
    private AccountHolderAddress address;
}
