package investment;

import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class InvestmentHolder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String otherName;
    private String gender;
    private String maritalStatus;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToOne
    private InvestmentHolderContact contact;
    @CreationTimestamp
    private LocalDateTime localDateTime;
}
