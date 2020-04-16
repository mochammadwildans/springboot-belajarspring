package com.ats.belajarspring.model;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_PASIEN")
public class PasienModel {
    
	@Id
	@Column(name="KODE_PASIEN")
	private String kodePasien;
	
	@Column(name="NAMA_PASIEN")
	private String namaPasien;

	@Column(name="GENDER")
	private String gender;
	
	@Column(name="KATEGORI")
	private String kategori;

	@Column(name="BIAYA")
	private Integer biaya;
	
	@Column(name="TANGGAL_LAHIR")
	private Date tanggalLahir;
	public String getKodePasien() {
		return kodePasien;
	}
	public void setKodePasien(String kodePasien) {
		this.kodePasien = kodePasien;
	}
	public String getNamaPasien() {
		return namaPasien;
	}
	public void setNamaPasien(String namaPasien) {
		this.namaPasien = namaPasien;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getKategori() {
		return kategori;
	}
	public void setKategori(String kategori) {
		this.kategori = kategori;
	}
	public Integer getBiaya() {
		return biaya;
	}
	public void setBiaya(Integer biaya) {
		this.biaya = biaya;
	}
	public Date getTanggalLahir() {
		return tanggalLahir;
	}
	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	
	
}
