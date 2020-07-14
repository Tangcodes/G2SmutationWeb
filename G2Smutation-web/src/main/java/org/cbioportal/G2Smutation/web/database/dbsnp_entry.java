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
@Table(name="dbsnp_entry")
public class dbsnp_entry {	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
    public Integer dbsnpId;
	
	@Column(name = "CHR_POS")
    public Integer chr;
	
	@Column(name = "MUTATION_ID")
    public Integer mutationId;
	
	@Column(name = "RS_ID")
    public Integer rsId;
	
	
	
	//Start
    public dbsnp_entry(){}
    
    public Integer getdbsnpId() {
        return dbsnpId;
    }
    
    public Integer getchr() {
        return chr;
    }
    
    public Integer mutationId() {
        return mutationId;
    }
    
    public Integer getrsId() {
        return rsId;
    }

}
