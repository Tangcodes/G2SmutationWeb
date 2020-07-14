package org.cbioportal.G2Smutation.web.domain;

import org.cbioportal.G2Smutation.web.database.tcga_entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface TcgaRepository extends JpaRepository<tcga_entry, Integer> {
	List<tcga_entry> findBymutationId(Integer id);
}