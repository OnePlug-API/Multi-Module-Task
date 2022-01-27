package com.oneplug.repository.pensionRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.oneplug.model.pension.Pension;

@Repository
public interface PensionRepository extends MongoRepository<Pension, Long> {
}
