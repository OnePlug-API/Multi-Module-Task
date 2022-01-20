package account;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Document
public class AccountHolderTransaction {

    @Id
    private String id;
    private String accountNumber;
    private BigDecimal amount;
    private String narrative;
    private String beneficiary;
    @CreationTimestamp
    private LocalDateTime localDateTime;
    private String transactionStatus;

}
