package edu.gazi.bilgisayar.beltek;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Fakulte implements Serializable {
	@Id
	@GeneratedValue
	private Integer num;
	private String fakulteAdi;
	private String bolumAdi;
	@OneToOne(mappedBy = "fakulte")
	private Ogrenci ogrenci;

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getFakulteAdi() {
		return fakulteAdi;
	}

	public void setFakulteAdi(String fakulteAdi) {
		this.fakulteAdi = fakulteAdi;
	}

	public String getBolumAdi() {
		return bolumAdi;
	}

	public void setBolumAdi(String bolumAdi) {
		this.bolumAdi = bolumAdi;
	}

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

}
