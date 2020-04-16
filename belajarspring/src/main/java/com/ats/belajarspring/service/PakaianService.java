package com.ats.belajarspring.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.belajarspring.model.PakaianModel;
import com.ats.belajarspring.repository.PakaianRepository;

@Service
@Transactional
public class PakaianService {
	
	@Autowired
	private PakaianRepository pakaianRepository;
	
	public void create(PakaianModel pakaianModel) {
		pakaianRepository.save(pakaianModel);
	}
	
	public List<PakaianModel> read(){
		return pakaianRepository.findAll();
		
	}
	
	public List<PakaianModel> readOrderNama() {
		return pakaianRepository.querySelectAllOrderNamaDesc();
	}
}
