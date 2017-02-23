package com.takatas.oot.mbean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.takatas.oot.entity.Kisi;
import com.takatas.oot.service.KisiService;

@ManagedBean(name = "kisiBean")
@ViewScoped
public class KisiMBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2591403243647831656L;

	private KisiService kisiService;
	private List<Kisi> kisis;
	private Kisi kisi;

	@PostConstruct
	public void init() {
		kisiService = new KisiService();
		yeni();
		listele();

	}

	public void kaydet() {

		try {
			if (kisi.getId() == null) {
				kisiService.save(kisi);
				mesajGoster("Kayýt", "Kayýt Eklendi");
			} else {
				kisiService.update(kisi);
				mesajGoster("Güncelleme", "Kayýt Güncellendi");
			}
			yeni();
			listele();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	
	public void seciliKayit(Long id){
		this.kisi = kisiService.getById(id);
	}
	
	public void seciliyiSil(Long id){
		kisiService.delete(id);
		mesajGoster("Kayýt Silindi", "Silinen Kayýt"+id);
		listele();
	}

	public void yeni() {
		kisi = new Kisi();

	}

	private void listele() {
		kisis = kisiService.getAll(null);

	}

	public void mesajGoster(String baslik, String detay) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(baslik, detay));
	}

	/**
	 * Getter/ Setter
	 */

	public List<Kisi> getKisis() {
		return kisis;
	}

	public Kisi getKisi() {
		return kisi;
	}

	public void setKisi(Kisi kisi) {
		this.kisi = kisi;
	}

}
