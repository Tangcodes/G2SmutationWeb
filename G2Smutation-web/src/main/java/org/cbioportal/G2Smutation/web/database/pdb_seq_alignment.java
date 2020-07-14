package org.cbioportal.G2Smutation.web.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
//@Table(name="pdb_seq_alignment")
//@SecondaryTable(name="mutation_usage_table")
public class pdb_seq_alignment {
	
	@Id	
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ALIGNMENT_ID")
    public Integer alignmentId;
	public Integer getalignmentId() {
        return alignmentId;
    }
	
	@Column(name = "PDB_ID")
	public String pdbId;
	public String getpdbId() {
        return pdbId;
    }
	
	@Column(name = "CHAIN")
	public String chain;
	public String getchain() {
        return chain;
    }
	
	@Column(name = "PDB_SEG")
	public Integer pdbSeg;
	public Integer getpdbSeg() {
        return pdbSeg;
    }
	
	@Column(name = "SEQ_ID")
	public Integer seqId;
	public Integer getseqId() {
        return seqId;
    }
	
	@Column(name = "PDB_FROM")
	public Integer pdbFrom;
	public Integer getpdbFrom() {
        return pdbFrom;
    }
	
	@Column(name = "PDB_TO")
	public Integer pdbTo;
	public Integer getpdbTo() {
        return pdbTo;
    }
	
	@Column(name = "SEQ_FROM")
	public Integer seqFrom;
	public Integer getseqFrom() {
        return seqFrom;
    }
	
	@Column(name = "SEQ_TO")
	public Integer seqTo;
	public Integer getseqTo() {
        return seqTo;
    }
	
	@Column(name = "EVALUE")
	public Double evalue;
	public Double getevalue() {
        return evalue;
    }
	
	@Column(name = "BITSCORE")
	public Double bitscore;
	public Double getbitscore() {
        return bitscore;
    }
	
	@Column(name = "IDENTITY")
	public Integer identity;
	public Integer getidentity() {
        return identity;
    }
	
	@Column(name = "IDENTP")
	public Double identp;
	public Double getidentp() {
        return identp;
    }
	
	@Column(name = "SEQ_ALIGN")
	public String seqAlign;
	public String getseqAlign() {
        return seqAlign;
    }
	
    public pdb_seq_alignment(){}

}