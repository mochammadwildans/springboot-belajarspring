package com.ats.belajarspring.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ats.belajarspring.model.DokterModel;

public interface DokterRepository extends JpaRepository<DokterModel, Integer> {
	
	@Query("SELECT D FROM DokterModel D WHERE D.nameDoct =?1") //?1 PArameternya SAtu
	DokterModel querySelectNama(String nameDoct);

}
