package org.cbioportal.G2Smutation.web.domain;

import org.cbioportal.G2Smutation.web.database.dbsnp_entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface DbsnpRepository extends JpaRepository<dbsnp_entry, Integer> {
	List<dbsnp_entry> findBymutationId(Integer id);
}