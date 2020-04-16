package com.ats.belajarspring.service;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.belajarspring.model.BotolModel;
import com.ats.belajarspring.repository.BotolRepository;


@Service
@Transactional
public class BotolService {
	
	@Autowired
	private BotolRepository botolRepository;
	
	public void create(BotolModel botolModel) {
		botolRepository.save(botolModel);
	}
	

}
