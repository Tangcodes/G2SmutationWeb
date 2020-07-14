package org.cbioportal.G2Smutation.web.domain;

import org.cbioportal.G2Smutation.web.database.genie_entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface GenieRepository extends JpaRepository<genie_entry, Integer> {
	List<genie_entry> findBymutationId(Integer id);
}