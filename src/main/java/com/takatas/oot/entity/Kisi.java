package com.takatas.oot.entity;

import java.beans.Transient;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "kisi")
@SequenceGenerator(name = "default_id_generator", sequenceName = "seq_kisi", allocationSize = 1)
public class Kisi extends EBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3410116197068702061L;
	private String ad;
	private String soyad;
	private Date dogumTarihi;
	private Long tc;
	private String babaAdi;
	private String anaAdi;
	private Cinsiyet cinsiyet;
	private Il il;
	private Ilce ilce;
	private String acikAdres;
	private String tel;
	@SuppressWarnings("unused")
	private String adSoyad;
	@SuppressWarnings("unused")
	private int yas;

	@Column(name = "ad", length = 70)
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	@Column(name = "soyad", length = 70)
	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dogumtarihi")
	public Date getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	@Column(name = "tc")
	public Long getTc() {
		return tc;
	}

	public void setTc(Long tc) {
		this.tc = tc;
	}

	@Column(name = "babaadi")
	public String getBabaAdi() {
		return babaAdi;
	}

	public void setBabaAdi(String babaAdi) {
		this.babaAdi = babaAdi;
	}

	@Column(name = "babaadi")
	public String getAnaAdi() {
		return anaAdi;
	}

	public void setAnaAdi(String anaAdi) {
		this.anaAdi = anaAdi;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "cinsiyet")
	public Cinsiyet getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(Cinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	@JoinColumn(name = "il_id")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	public Il getIl() {
		return il;
	}

	public void setIl(Il il) {
		this.il = il;
	}

	@JoinColumn(name = "ilce_id")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	public Ilce getIlce() {
		return ilce;
	}

	public void setIlce(Ilce ilce) {
		this.ilce = ilce;
	}

	@Column(name = "acikadres")
	public String getAcikAdres() {
		return acikAdres;
	}

	public void setAcikAdres(String acikAdres) {
		this.acikAdres = acikAdres;
	}

	@Column(name = "tel")
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Transient
	public String getAdSoyad() {
		return this.ad+" "+this.soyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	@SuppressWarnings("deprecation")
	@Transient
	public int getYas() {
		return new Date().getYear() - dogumTarihi.getYear();
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

}
