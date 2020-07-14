package org.cbioportal.G2Smutation.web.domain;

import java.util.List;
import org.cbioportal.G2Smutation.web.database.rs_mutation_entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RsRepository extends JpaRepository<rs_mutation_entry, Integer> {
	List<rs_mutation_entry> findByrsSnpId(Integer id);
	List<rs_mutation_entry> findByseqId(Integer id);
	List<rs_mutation_entry> findByseqIndex(Integer id);
	List<rs_mutation_entry> findByseqIdAndSeqIndex(Integer id1,Integer id2);
	List<rs_mutation_entry> findBypdbNoStartingWith(String id);
	List<rs_mutation_entry> findBypdbIndex(Integer id);
}
