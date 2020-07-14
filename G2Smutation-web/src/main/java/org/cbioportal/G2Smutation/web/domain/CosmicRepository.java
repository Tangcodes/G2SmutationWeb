package org.cbioportal.G2Smutation.web.domain;

import org.cbioportal.G2Smutation.web.database.cosmic_entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface CosmicRepository extends JpaRepository<cosmic_entry, Integer> {
	List<cosmic_entry> findBymutationId(Integer id);
}

