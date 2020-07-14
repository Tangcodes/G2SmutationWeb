package org.cbioportal.G2Smutation.web.domain;

import org.cbioportal.G2Smutation.web.database.structure_annotation_entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface StructureRepository extends JpaRepository<structure_annotation_entry, Integer> {
	List<structure_annotation_entry> findBymutationId(Integer id);
}