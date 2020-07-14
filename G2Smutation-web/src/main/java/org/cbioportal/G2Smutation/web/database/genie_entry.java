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
@Table(name="genie_entry")
public class genie_entry {	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
    public Integer genisId;
	
	@Column(name = "CHR_POS")
    public Integer chr;
	
	@Column(name = "MUTATION_ID")
    public Integer mutationId;
		
	@Column(name = "HUGO_SYMBOL")
	public String HUGOSYMBOL;
	
	@Column(name = "ENTREZ_GENE_ID")
	public String ENTREZGENEID;
	
	@Column(name = "CENTER")
	public String CENTER;
	
	@Column(name = "NCBI_BUILD")
	public String NCBIBUILD;
	
	@Column(name = "CHROMOSOME")
	public String CHROMOSOME;
	
	@Column(name = "START_POSITION")
	public String STARTPOSITION;
	
	@Column(name = "END_POSITION")
	public String ENDPOSITION;
	
	@Column(name = "STRAND")
	public String STRAND;
	
	@Column(name = "VARIANT_CLASSIFICATION")
	public String VARIANTCLASSIFICATION;
	
	@Column(name = " VARIANT_TYPE")
	public String VARIANTTYPE;
	
	@Column(name = "REFERENCE_ALLELE")
	public String REFERENCEALLELE;
	
	//Start
    public genie_entry(){}
    
    public Integer getgenisId() {
        return genisId;
    }
    
    public Integer getchr() {
        return chr;
    }
    
    public Integer mutationId() {
        return mutationId;
    }
    
    public String getHUGO_SYMBOL() {
        return HUGOSYMBOL;
    }
    
    public String getENTREZ_GENE_ID() {
        return ENTREZGENEID;
    }
    
    public String getNCBI_BUILD() {
        return NCBIBUILD;
    }
    
    public String getCHROMOSOME() {
        return CHROMOSOME;
    }
    
    public String getSTARTPOSITION() {
        return STARTPOSITION;
    }
    
    public String getENDPOSITION() {
        return ENDPOSITION;
    }
    
    public String getSTRAND() {
        return STRAND;
    }
    
    public String getVARIANTCLASSIFICATION() {
        return VARIANTCLASSIFICATION;
    }
    
    public String getVARIANTTYPE() {
        return VARIANTTYPE;
    }
    
    public String getREFERENCEALLELE() {
        return REFERENCEALLELE;
    }


}
