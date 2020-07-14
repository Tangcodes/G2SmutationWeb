package org.cbioportal.G2Smutation.web.domain;

import java.util.List;
import javax.transaction.Transactional;
import org.cbioportal.G2Smutation.web.models.GeneSequence;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author Juexin Wang
 *
 */
@Transactional
public interface GeneSequenceRepository extends JpaRepository<GeneSequence, Long> {
    public List<GeneSequence> findBySeqId(String seqId);
}
