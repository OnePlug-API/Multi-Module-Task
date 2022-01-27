package com.oneplug.repository.pensionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.oneplug.model.pension.PensionHolder;

@Repository
public interface PensionHolderRepository extends JpaRepository<PensionHolder, Long> {

}
