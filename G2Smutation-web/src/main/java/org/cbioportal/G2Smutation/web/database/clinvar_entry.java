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
@Table(name="clinvar_entry")
public class clinvar_entry {	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
    public Integer clinvarId;
	
	@Column(name = "CHR_POS")
    public Integer chr;
	
	@Column(name = "MUTATION_ID")
    public Integer mutationId;
	
	@Column(name = "CLINVAR_ID")
    public Integer clinvarID;
	
	@Column(name = "REF")
	public String ref;
	
	@Column(name = "ALT")
	public String alt;
	
	@Column(name = "AF_ESP")
	public String AFESP;
	
	@Column(name = "AF_EXAC")
	public String AFEXAC;
	
	@Column(name = "AF_TGP")
	public String AFTGP;
	
	@Column(name = "ALLELEID")
	public String ALLELEID;
	
	@Column(name = "CLNDN")
	public String CLNDN;
	
	@Column(name = "CLNDNINCL")
	public String CLNDNINCL;
	
	@Column(name = "CLNDISDB")
	public String CLNDISDB;
	
	@Column(name = "CLNDISDBINCL")
	public String CLNDISDBINCL;
	
	@Column(name = "CLNHGVS")
	public String CLNHGVS;
	
	//Start
    public clinvar_entry(){}
    
    /*
    public Integer getclinvarId() {
        return clinvarId;
    }
    
    public Integer getchr() {
        return chr;
    }
    
    public Integer mutationId() {
        return mutationId;
    }
    
    public Integer getclinvarID() {
        return clinvarID;
    }
    
    public String getref() {
        return ref;
    }
    
    public String getalt() {
        return alt;
    }
    
    public String getAFESP() {
        return AFESP;
    }
    
    public String getAFEXAC() {
        return AFEXAC;
    }
    
    public String getAFTGP() {
        return AFTGP;
    }
    
    public String getALLELEID() {
        return ALLELEID;
    }
    
    public String getCLNDN() {
        return CLNDN;
    }
    
    public String getCLNDNINCL() {
        return CLNDNINCL;
    }
    
    public String getCLNDISDB() {
        return CLNDISDB;
    }
    
    public String getCLNDISDBINCL() {
        return CLNDISDBINCL;
    }
    
    public String getCLNHGVS() {
        return CLNHGVS;
    }
	*/
}
