package com.ats.belajarspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Dokter")
public class DokterModel {
	
	@Id
	@Column(name= "id")
	private Integer idDoct;
	
	@Column(name="nama")
	private String nameDoct;
	
	@Column(name="Specialist")
	private String specialistDoct;
	
	@Column(name="salary")
	private String salaryDoct;
	
	
	public Integer getIdDoct() {
		return idDoct;
	}
	public void setIdDoct(Integer idDoct) {
		this.idDoct = idDoct;
	}
	public String getNameDoct() {
		return nameDoct;
	}
	public void setNameDoct(String nameDoct) {
		this.nameDoct = nameDoct;
	}
	public String getSpecialistDoct() {
		return specialistDoct;
	}
	public void setSpecialistDoct(String specialistDoct) {
		this.specialistDoct = specialistDoct;
	}
	public String getSalaryDoct() {
		return salaryDoct;
	}
	public void setSalaryDoct(String salaryDoct) {
		this.salaryDoct = salaryDoct;
	}
	

}
