package edu.gazi.bilgisayar.beltek;

import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class OgrenciBean {
	private Ogrenci ogrenci = new Ogrenci();
	private String araAd;
	private String araSoyad;

	public void kaydet() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.persist(ogrenci.getFakulte());
		en.persist(ogrenci);
		en.getTransaction().commit();
		ogrenci = new Ogrenci();
	}

	public void sil() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.remove(ogrenci.getFakulte());
		en.remove(ogrenci);
		en.getTransaction().commit();
		ogrenci = new Ogrenci();
	}

	public void guncelle() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.merge(ogrenci.getFakulte());
		en.merge(ogrenci);
		en.getTransaction().commit();
		ogrenci = new Ogrenci();
	}

	public void ara() {

	}

	public List<Ogrenci> getListe() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("from Ogrenci").getResultList();
	}

	public List<Ogrenci> getAraListe() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("from Ogrenci where ad=:araad and soyad=:arasoyad").setParameter("araad", araAd)
				.setParameter("arasoyad", araSoyad).getResultList();

	}

	public String getAraAd() {
		return araAd;
	}

	public void setAraAd(String araAd) {
		this.araAd = araAd;
	}

	public String getAraSoyad() {
		return araSoyad;
	}

	public void setAraSoyad(String araSoyad) {
		this.araSoyad = araSoyad;
	}

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

}
