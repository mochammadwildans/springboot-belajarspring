package com.ats.belajarspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ats.belajarspring.model.DosenModel;

public interface DosenRepository extends JpaRepository<DosenModel, String>{

	// Ini bukan SQL tapi HQL (Hibernate Query Language)
	// HQL itu query yg bisa dijalankan pada hibernate
	@Query("SELECT D FROM DosenModel D ORDER BY D.namaDosen DESC")
	List<DosenModel> querySelectAllOrderNamaDesc();
	
	@Query("SELECT D FROM DosenModel D ORDER BY D.namaDosen ASC")
	List<DosenModel> querySelectAllOrderNamaAsc();
	
	@Query("SELECT D FROM DosenModel D ORDER BY D.usiaDosen DESC")
	List<DosenModel> querySelectAllOrderUsiaDesc();
	
	@Query("SELECT D FROM DosenModel D ORDER BY D.usiaDosen ASC")
	List<DosenModel> querySelectAllOrderUsiaAsc();
	
	@Query("SELECT D FROM DosenModel D WHERE D.namaDosen LIKE %?1%")
	List<DosenModel> querySelectAllWhereNama(String kataKunci);
	
}
