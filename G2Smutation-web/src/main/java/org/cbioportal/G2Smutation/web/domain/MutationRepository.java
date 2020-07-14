package org.cbioportal.G2Smutation.web.domain;

import org.cbioportal.G2Smutation.web.database.mutation_usage_table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface MutationRepository extends JpaRepository<mutation_usage_table, Integer> {
	List<mutation_usage_table> findTop10BymutationIdGreaterThan(Integer id);
	
	List<mutation_usage_table> findByseqNameContaining(String id);
	
	List<mutation_usage_table> findByseqIndex(String id);
	List<mutation_usage_table> findBypdbIndex(String id);
	List<mutation_usage_table> findByseqIndexAndPdbIndex(String id1,String id2);
	
	List<mutation_usage_table> findByseqResidue(String id);
	List<mutation_usage_table> findBypdbResidue(String id);
	List<mutation_usage_table> findByseqResidueAndPdbResidue(String id1,String id2);
	
	List<mutation_usage_table> findBypdbNoStartingWith(String id);
	
	
	@Query(value = "select * from mutation_usage_table where PDB_NO LIKE '?1%' And SEQ_INDEX = ?2", nativeQuery = true)
	List<mutation_usage_table> findBypdbNoAndPdbIndex(String id1,Integer id2);
	List<mutation_usage_table> findByalignmentId(Integer id);
}

