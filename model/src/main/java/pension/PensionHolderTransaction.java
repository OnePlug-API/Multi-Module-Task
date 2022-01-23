package pension;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Document
public class PensionHolderTransaction {

    @Id
    private String id;
    private String pensionNumber;
    private BigDecimal amount;
    private String narrative;
    @CreationTimestamp
    private LocalDateTime localDateTime;
    private String transactionStatus;
}
