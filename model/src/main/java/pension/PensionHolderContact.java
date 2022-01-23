package pension;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Data
@Entity
public class PensionHolderContact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String phoneNumber;
    private String email;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToOne
    private PensionHolderAddress address;
}
