package org.cbioportal.G2Smutation.web.domain;

import org.cbioportal.G2Smutation.web.database.pdb_seq_alignment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PdbRepository extends JpaRepository<pdb_seq_alignment, Integer> {
	List<pdb_seq_alignment> findByalignmentId(Integer id);
}
