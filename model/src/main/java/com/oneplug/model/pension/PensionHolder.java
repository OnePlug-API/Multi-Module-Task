package com.oneplug.model.pension;

import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class PensionHolder {

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
    private PensionHolderContact contact;
    @CreationTimestamp
    private LocalDateTime localDateTime;
}
