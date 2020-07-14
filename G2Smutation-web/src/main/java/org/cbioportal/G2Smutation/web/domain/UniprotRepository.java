package org.cbioportal.G2Smutation.web.domain;

import java.util.List;

import javax.transaction.Transactional;

import org.cbioportal.G2Smutation.web.models.Uniprot;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author Juexin Wang
 *
 */
@Transactional
public interface UniprotRepository extends JpaRepository<Uniprot, Long> {
    public List<Uniprot> findByUniprotAccessionIso(String uniprotAccessionIso);

    public List<Uniprot> findByUniprotAccession(String uniprotAccession);

    public List<Uniprot> findByUniprotId(String uniprotId);

}
