package org.cbioportal.G2Smutation.web.domain;

import org.cbioportal.G2Smutation.web.database.clinvar_entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface ClinvarRepository extends JpaRepository<clinvar_entry, Integer> {
	List<clinvar_entry> findBymutationId(Integer id);
}