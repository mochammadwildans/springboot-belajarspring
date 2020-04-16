package com.ats.belajarspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_SEKOLAH")
public class SekolahModel {
	
	@Id
	@Column(name="Id_Sekolah")
	private int nomorSekolah;
	
	@Column(name="Nama_Sekolah")
	private String namaSekolah;
	
	
	
	public int getNomorSekolah() {
		return nomorSekolah;
	}
	public void setNomorSekolah(int nomorSekolah) {
		this.nomorSekolah = nomorSekolah;
	}
	public String getNamaSekolah() {
		return namaSekolah;
	}
	public void setNamaSekolah(String namaSekolah) {
		this.namaSekolah = namaSekolah;
	}
	

}
