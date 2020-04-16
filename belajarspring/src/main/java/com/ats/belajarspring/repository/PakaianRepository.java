package com.ats.belajarspring.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ats.belajarspring.model.PakaianModel;

public interface PakaianRepository extends JpaRepository<PakaianModel, String> {
	
	@Query("SELECT P FROM PakaianModel P WHERE P.ukuran = 11 ORDER BY P.hargaPakaian ASC")
	List<PakaianModel> querySelectAllOrderNamaDesc();

}
