package com.ats.belajarspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ats.belajarspring.model.PasienModel;

public interface PasienRepository extends JpaRepository<PasienModel, String>{
	
	//Save 
	// Update
	// Read
	// Delete
	
	@Query("SELECT P FROM PasienModel P WHERE P.namaPasien =?1") //?1 PArameternya SAtu
	List<PasienModel > querySelectNama(String namaPasien);

}
