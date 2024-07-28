package edu.gazi.bilgisayar.beltek;

import java.io.Serializable;

public class BirinciAnahtar implements Serializable {
	private String ulkeKodu;
	private String kimlikNo;

	public String getUlkeKodu() {
		return ulkeKodu;
	}

	public void setUlkeKodu(String ulkeKodu) {
		this.ulkeKodu = ulkeKodu;
	}

	public String getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

}
