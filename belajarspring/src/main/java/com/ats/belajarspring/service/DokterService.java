package com.ats.belajarspring.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.belajarspring.model.DokterModel;
import com.ats.belajarspring.repository.DokterRepository;

@Service
@Transactional
public class DokterService {
	
	@Autowired
	private DokterRepository dokterRepository;
	
	
	public void create(DokterModel dokterModel) {
		dokterRepository.save(dokterModel);
		
	}
	
	public List<DokterModel> read(){
		return dokterRepository.findAll(); 
		}

	public List<DokterModel> read(DokterModel dokterModel){
	return dokterRepository.findAll(); 
	}
	
	public DokterModel readNama(String nameDoct){
	return dokterRepository.querySelectNama(nameDoct); 
		}
	
	public void update(DokterModel dokterModel) {
		dokterRepository.save(dokterModel);
		
	}
	
	public void delete(Integer idDoct) {
	this.dokterRepository.deleteById(idDoct);
	}
	
	

}
