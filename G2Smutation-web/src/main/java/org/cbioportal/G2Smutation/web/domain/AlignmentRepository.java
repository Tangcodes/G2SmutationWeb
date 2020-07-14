package org.cbioportal.G2Smutation.web.domain;

import java.util.List;
import javax.transaction.Transactional;
import org.cbioportal.G2Smutation.web.models.Alignment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Juexin Wang
 *
 */
@Transactional
public interface AlignmentRepository extends JpaRepository<Alignment, Long> {
    public List<Alignment> findBySeqId(String seqId);

    public Alignment findByAlignmentId(int alignmentId);
}
