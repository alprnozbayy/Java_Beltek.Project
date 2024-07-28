package edu.gazi.bilgisayar.beltek;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sinan")
public class Ogrenci implements Serializable {
	@EmbeddedId
	private BirinciAnahtar anahtar = new BirinciAnahtar();
	private String ad;
	private String soyad;
	private Integer yas;
	@Embedded
	private Adres adres = new Adres();
	@OneToOne
	private Fakulte fakulte = new Fakulte();

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Integer getYas() {
		return yas;
	}

	public void setYas(Integer yas) {
		this.yas = yas;
	}

	public BirinciAnahtar getAnahtar() {
		return anahtar;
	}

	public void setAnahtar(BirinciAnahtar anahtar) {
		this.anahtar = anahtar;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public Fakulte getFakulte() {
		return fakulte;
	}

	public void setFakulte(Fakulte fakulte) {
		this.fakulte = fakulte;
	}

}
