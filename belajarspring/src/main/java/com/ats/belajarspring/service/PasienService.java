package com.ats.belajarspring.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.belajarspring.model.PasienModel;
import com.ats.belajarspring.repository.PasienRepository;

@Service
@Transactional
public class PasienService {
	
	@Autowired
	private PasienRepository pasienRepository;
	
	public void create (PasienModel PasienModel) {
		pasienRepository.save(PasienModel);
	}
	
	public void update(PasienModel pasienModel) {
		pasienRepository.save(pasienModel);
	}
	
	public List<PasienModel> readNama(String namaPasien){
		return pasienRepository.querySelectNama(namaPasien); 
	}
	
	public List<PasienModel> baca(){
	return	pasienRepository.findAll();
	}
	
	
	public void delete(String kodePasien) {
		this.pasienRepository.deleteById(kodePasien);
	}

	
}
