package com.ats.belajarspring.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// adanya anotasi agar tidak menggunakan query , seperti creat table dll

@Entity
@Table(name="TBL_DOSEN")
public class DosenModel {

	@Id
	@Column(name="CLM_NAMA")
	private String namaDosen;
	
	@Column(name="CLM_USIA")
	private int usiaDosen;
	
	public String getNamaDosen() {
		return namaDosen;
	}
	public void setNamaDosen(String namaDosen) {
		this.namaDosen = namaDosen;
	}
	public int getUsiaDosen() {
		return usiaDosen;
	}
	public void setUsiaDosen(int usiaDosen) {
		this.usiaDosen = usiaDosen;
	}
	
}
