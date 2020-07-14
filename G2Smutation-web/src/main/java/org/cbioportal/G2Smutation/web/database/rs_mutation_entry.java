package org.cbioportal.G2Smutation.web.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="rs_mutation_entry")
//@SecondaryTable(name="mutation_usage_table")
//This class is for rs.html Search Page
public class rs_mutation_entry {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
    public Integer rsId;
	
	@Column(name = "ALIGNMENT_ID")
    public Integer alignmentId;
	
	@Column(name = "RS_SNP_ID")
    public Integer rsSnpId;
	
	@Column(name = "SEQ_ID")
	public Integer seqId;
	
	@Column(name = "SEQ_INDEX")
	public Integer seqIndex;
	
	@Column(name = "SEQ_RESIDUE")
	public String seqResidue;
	
	@Column(name = "PDB_NO")
	public String pdbNo;
	
	@Column(name = "PDB_INDEX")
	public Integer pdbIndex;
	
	@Column(name = "PDB_RESIDUE")
	public String pdbResidue;
	
	//@Column(name = "SEQ_NAME", table="mutation_usage_table")
	//public String seqName;


    public rs_mutation_entry(){}

    public Integer getrsId() {
        return rsId;
    }
    
    public Integer getrsSnpId() {
        return rsSnpId;
    }
    
    public Integer getseqId() {
        return seqId;
    }
    
    public Integer getseqIndex() {
        return seqIndex;
    }
    
    public String getseqResidue() {
        return seqResidue;
    }
    
    public String getpdbNo() {
        return pdbNo;
    }
    
    public Integer getpdbIndex() {
        return pdbIndex;
    }

    public String getpdbResidue() {
        return pdbResidue;
    }

    public Integer getalignmentId() {
        return alignmentId;
    }
    
    /*
    public String getseqName() {
        return seqName;
    }
    */
}
