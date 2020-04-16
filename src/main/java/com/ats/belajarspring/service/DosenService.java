package com.ats.belajarspring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.belajarspring.model.DosenModel;
import com.ats.belajarspring.repository.DosenRepository;

@Service
@Transactional
public class DosenService {

	@Autowired
	private DosenRepository dosenRepository;
	
	// modifier kosong/tdk namaMethod(TipeVariable namaVariabel)
	public void create(DosenModel dosenModel) {
		dosenRepository.save(dosenModel);
		// method save tdk ada di repository krn berasal dari JpaRepository
	}
	
	public List<DosenModel> read() {
		return dosenRepository.findAll();
	}
	
	public List<DosenModel> readOrderNama() {
		return dosenRepository.querySelectAllOrderNamaDesc();
	}
	
	public List<DosenModel> readOrderBy() {
		return dosenRepository.querySelectAllOrderUsiaDesc();
	}
	
	public List<DosenModel> readWhereNama(String kataKunci) {
		return dosenRepository.querySelectAllWhereNama(kataKunci);
	}
	
}
