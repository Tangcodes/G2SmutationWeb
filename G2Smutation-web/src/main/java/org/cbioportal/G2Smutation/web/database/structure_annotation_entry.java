package org.cbioportal.G2Smutation.web.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name="structure_annotation_entry")
public class structure_annotation_entry {	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
    public Integer structureId;
	
	@Column(name = "CHR_POS")
    public Integer chr;
	
	@Column(name = "MUTATION_ID")
    public Integer mutationId;
	
	@Column(name = "PDB_NO")
    public String pdbNo;
	
	@Column(name = "PDB_INDEX")
    public String pdbIndex;
	
	@Column(name = "PDB_RESIDUE")
    public String PdbResidue;
	
	@Column(name = "BURIED")
    public String BURIED;
	
	@Column(name = "ALL_ATOMS_ABS")
    public String ALLATOMSABS;
	
	@Column(name = "ALL_ATOMS_REL")
    public String ALLATOMSREL;
	
	@Column(name = "TOTAL_SIDE_ABS")
    public String TOTALSIDEABS;
	
	@Column(name = "TOTAL_SIDE_REL")
    public String TOTALSIDEREL;
	
	@Column(name = "MAIN_CHAIN_ABS")
    public String MAINCHAINABS;
	
	@Column(name = "MAIN_CHAIN_REL")
    public String MAINCHAINREL;
	
	@Column(name = "NON_POLAR_ABS")
    public String NONPOLARABS;
	
	@Column(name = "NON_POLAR_REL")
    public String NONPOLARREL;
	
	@Column(name = "ALL_POLAR_ABS")
    public String ALLPOLARABS;
	
	@Column(name = "ALL_POLAR_REL")
    public String ALLPOLARREL;
	
	@Column(name = "SEC_STRUCTURE")
    public String SECSTRUCTURE;
	
	@Column(name = "THREE_TURN_HELIX")
    public String THREETURNHELIX;
	
	@Column(name = "FOUR_TURN_HELIX")
    public String FOURTURNHELIX;
	
	@Column(name = "FIVE_TURN_HELIX")
    public String FIVETURNHELIX;
	
	//Start
    public structure_annotation_entry(){}
    
    
    public Integer getstructureId() {
        return structureId;
    }
    
    public Integer getchr() {
        return chr;
    }
    
    public Integer mutationId() {
        return mutationId;
    }
    
    public String getpdbNo() {
        return pdbNo;
    }
    
    public String getpdbIndex() {
        return pdbIndex;
    }
    
    public String getPdbResidue() {
        return PdbResidue;
    }
    
    public String getBURIED() {
        return BURIED;
    }
    
    public String getALLATOMSABS() {
        return ALLATOMSABS;
    }
    
    public String getALLATOMSREL() {
        return ALLATOMSREL;
    }
    
    public String getTOTALSIDEABS() {
        return TOTALSIDEABS;
    }
    
    public String getTOTALSIDEREL() {
        return TOTALSIDEREL;
    }
    
    public String getMAINCHAINABS() {
        return MAINCHAINABS;
    }
    
    public String getMAINCHAINREL() {
        return MAINCHAINREL;
    }
    
    public String getNONPOLARABS() {
        return NONPOLARABS;
    }
    
    public String getNONPOLARREL() {
        return NONPOLARREL;
    }
    
    public String getALLPOLARABS() {
        return ALLPOLARABS;
    }
    
    public String getALLPOLARREL() {
        return ALLPOLARREL;
    }
    
    public String getSECSTRUCTURE() {
        return SECSTRUCTURE;
    }
    
    public String getTHREETURNHELIX() {
        return THREETURNHELIX;
    }
    
    public String getFOURTURNHELIX() {
        return FOURTURNHELIX;
    }
    
    public String getFIVETURNHELIX() {
        return FIVETURNHELIX;
    }
}
