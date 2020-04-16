package com.ats.belajarspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_BOTOL")
public class BotolModel {
	@Id
	@Column(name="NMR_BTL")
	private int nomorBotol;
	
	@Column(name="NM_BTL")
	private String namaBotol;
	
	
	
	public int getNomorBotol() {
		return nomorBotol;
	}
	public void setNomorBotol(int nomorBotol) {
		this.nomorBotol = nomorBotol;
	}
	public String getNamaBotol() {
		return namaBotol;
	}
	public void setNamaBotol(String namaBotol) {
		this.namaBotol = namaBotol;
	}
	
	

}
