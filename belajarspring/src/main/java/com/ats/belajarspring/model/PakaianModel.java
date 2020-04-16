package com.ats.belajarspring.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_PAKAIAN")
public class PakaianModel {
	
	@Id
	@Column(name="KLM_KD_PAKAIAN")
	private String kodePakaian;
	
	@Column(name="KLM_NM_PAKAIAN")
	private String namaPakaian;
	
	@Column(name="KLM_HRG_PAKAIAN")
	private int hargaPakaian;
	
	@Column(name="KLM_UKR_PAKAIAN")
	private int ukuran;

	
	
	
	public String getKodePakaian() {
		return kodePakaian;
	}

	public void setKodePakaian(String kodePakaian) {
		this.kodePakaian = kodePakaian;
	}

	public String getNamaPakaian() {
		return namaPakaian;
	}

	public void setNamaPakaian(String namaPakaian) {
		this.namaPakaian = namaPakaian;
	}

	public int getHargaPakaian() {
		return hargaPakaian;
	}

	public void setHargaPakaian(int hargaPakaian) {
		this.hargaPakaian = hargaPakaian;
	}

	public int getUkuran() {
		return ukuran;
	}

	public void setUkuran(int ukuran) {
		this.ukuran = ukuran;
	}
	
	
	

}
