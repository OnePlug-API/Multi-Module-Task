package investmentRepo;

import investment.Investment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentRepository extends MongoRepository<Investment, String> {

}
