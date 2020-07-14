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
@Table(name="tcga_entry")
public class tcga_entry {	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
    public Integer tcgaId;
	
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
	
	//Start
    public tcga_entry(){}
    
    public Integer gettcgaId() {
        return tcgaId;
    }
    
    public Integer getchr() {
        return chr;
    }
    
    public Integer mutationId() {
        return mutationId;
    }
    
    public String getHUGOSYMBOL() {
        return HUGOSYMBOL;
    }
    
    public String getENTREZGENEID() {
        return ENTREZGENEID;
    }
    
    public String getCENTER() {
        return CENTER;
    }
    
    public String getNCBIBUILD() {
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

}
