package org.cbioportal.G2Smutation.web.domain;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.cbioportal.G2Smutation.web.database.rs_mutation_entry_Initia;

public interface RsRepositoryInitia extends JpaRepository<rs_mutation_entry_Initia, Integer> {
	List<rs_mutation_entry_Initia> findTop20ByrsIdAfter(Integer id);
}
