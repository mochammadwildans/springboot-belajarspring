package com.ats.belajarspring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.belajarspring.model.SekolahModel;
import com.ats.belajarspring.repository.SekolahRepository;

@Service
@Transactional
public class SekolahService {

	@Autowired
	private SekolahRepository sekolahRepository;
	
	public void create(SekolahModel sekolahModel) {
		sekolahRepository.save(sekolahModel);
		
	}
	public List<SekolahModel> read() {
		return sekolahRepository.findAll();
		
	}
	
	public List<SekolahModel> readOrderBy() {
		return sekolahRepository.querySelectAllOrderNomorDesc();
		
	}
	
	public List<SekolahModel> readWhereNama(String cariNama) {
		return sekolahRepository.querySelectAllWhereNama(cariNama);
	}
}
