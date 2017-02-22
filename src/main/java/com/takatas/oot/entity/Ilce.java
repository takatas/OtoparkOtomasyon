package com.takatas.oot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ilce")
@SequenceGenerator(name= "default_id_generator", sequenceName= "seq_ilce", allocationSize = 1)
public class Ilce extends EBase{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3330076139800929005L;
	private String kod;
	private String ad;
	
	@Column(name = "kod", length= 50)
	public String getKod() {
		return kod;
	}
	
	public void setKod(String kod) {
		this.kod = kod;
	}

	@Column(name = "ad", length = 75)
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}

}
