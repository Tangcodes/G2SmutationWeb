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
@Table(name="cosmic_entry")
public class cosmic_entry {	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
    public Integer cosmicId;
	
	@Column(name = "CHR_POS")
    public Integer chr;
	
	@Column(name = "MUTATION_ID")
    public Integer mutationId;
	
	@Column(name = "GENE_NAME")
    public String geneName;
	
	@Column(name = "ACCESSION_NUMBER")
	public String accession;
	
	@Column(name = "GENE_CDS_LENGTH")
	public Integer geneLength;
	
	@Column(name = "HGNC_ID")
	public String HGNCID;
	
	@Column(name = "SAMPLE_NAME")
	public String SAMPLENAME;
	
	@Column(name = "ID_SAMPLE")
	public String IDSAMPLE;
	
	@Column(name = "ID_TUMOUR")
	public String IDTUMOUR;
	
	@Column(name = "PRIMARY_SITE")
	public String PRIMARYSITE;
	
	@Column(name = "SITE_SUBTYPE_1")
	public String  SITESUBTYPE1;
	
	@Column(name = "SITE_SUBTYPE_2")
	public String  SITESUBTYPE2;
	
	@Column(name = "SITE_SUBTYPE_3")
	public String  SITESUBTYPE3;
	
	//Start
    public cosmic_entry(){}
    
    
    public Integer getcosmicId() {
        return cosmicId;
    }
    
    public Integer getchr() {
        return chr;
    }
    
    public Integer mutationId() {
        return mutationId;
    }
    
    public String getgeneName() {
        return geneName;
    }
    
    public String getaccession() {
        return accession;
    }
    
    public Integer getgeneLength() {
        return geneLength;
    }
    
    public String getHGNCID() {
        return HGNCID;
    }
    
    public String getSAMPLENAME() {
        return SAMPLENAME;
    }
    
    public String getIDSAMPLE() {
        return IDSAMPLE;
    }
    
    public String getIDTUMOUR() {
        return IDTUMOUR;
    }
    
    public String getPRIMARYSITE() {
        return PRIMARYSITE;
    }
    
    public String getSITESUBTYPE1() {
        return SITESUBTYPE1;
    }
    
    public String getSITESUBTYPE2() {
        return SITESUBTYPE2;
    }
    
    public String getSITESUBTYPE3() {
        return SITESUBTYPE3;
    }

}
