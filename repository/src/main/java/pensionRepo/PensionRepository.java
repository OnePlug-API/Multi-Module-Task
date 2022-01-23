package pensionRepo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pension.Pension;

@Repository
public interface PensionRepository extends MongoRepository<Pension, Long> {
}
