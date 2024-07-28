package edu.gazi.bilgisayar.beltek;

import javax.persistence.Embeddable;

@Embeddable
public class Adres {
	private String cadde;
	private String sokak;

	public String getCadde() {
		return cadde;
	}

	public void setCadde(String cadde) {
		this.cadde = cadde;
	}

	public String getSokak() {
		return sokak;
	}

	public void setSokak(String sokak) {
		this.sokak = sokak;
	}

}
