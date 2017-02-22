package com.takatas.oot.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@MappedSuperclass
public class EBase implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3262250025183110059L;
	private Long id;
	private String ekleyen;
	private String guncelleyen;
	private Date eklemeTarihi;
	private Date guncellemeTarihi;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "default_id_generator", strategy = GenerationType.SEQUENCE )
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "ekleyen", length = 100)
	public String getEkleyen() {
		return ekleyen;
	}

	public void setEkleyen(String ekleyen) {
		this.ekleyen = ekleyen;
	}
	@Column(name = "guncelleyen", length = 100)
	public String getGuncelleyen() {
		return guncelleyen;
	}

	public void setGuncelleyen(String guncelleyen) {
		this.guncelleyen = guncelleyen;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ekleme_tarihi")
	public Date getEklemeTarihi() {
		return eklemeTarihi;
	}

	public void setEklemeTarihi(Date eklemeTarihi) {
		this.eklemeTarihi = eklemeTarihi;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "guncelleme_tarihi")
	public Date getGuncellemeTarihi() {
		return guncellemeTarihi;
	}

	public void setGuncellemeTarihi(Date guncellemeTarihi) {
		this.guncellemeTarihi = guncellemeTarihi;
	}

}
