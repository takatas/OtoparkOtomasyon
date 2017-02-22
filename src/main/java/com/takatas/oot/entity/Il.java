package com.takatas.oot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "il")
@SequenceGenerator(sequenceName = "seq_il", name = "default_id_generator", allocationSize = 1 )
public class Il extends EBase {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 6615745011234000930L;
	private String kod;
    private String ad;
    
    @Column(name = "ad", length = 50)
    public String getAd() {
		return ad;
	}
    
    public void setAd(String ad) {
		this.ad = ad;
	}
    
    @Column(name = "kod", length = 50)
    public String getKod() {
		return kod;
	}
    
    public void setKod(String kod) {
		this.kod = kod;
	}

}
