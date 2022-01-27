package com.oneplug.model.account;

import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class AccountHolder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String NIN;
    private String pvcNumber;
    private String firstname;
    private String lastname;
    private String otherName;
    private String gender;
    private String maritalStatus;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToOne
    private AccountHolderContact contact;
    @CreationTimestamp
    private LocalDateTime localDateTime;
}
