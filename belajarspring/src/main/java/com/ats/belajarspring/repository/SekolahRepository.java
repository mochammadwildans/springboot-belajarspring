package com.ats.belajarspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import com.ats.belajarspring.model.SekolahModel;

import java.util.List;


public interface SekolahRepository extends JpaRepository<SekolahModel, String>{
	
	
	@Query("SELECT S FROM SekolahModel S ORDER BY S.nomorSekolah DESC")
	List<SekolahModel> querySelectAllOrderNomorDesc();
	
	@Query("SELECT S FROM SekolahModel S WHERE S.namaSekolah LIKE %?1%")
	List<SekolahModel> querySelectAllWhereNama(String cariNama);
}
