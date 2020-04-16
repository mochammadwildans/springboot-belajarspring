package com.ats.belajarspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ats.belajarspring.model.BotolModel;
import com.ats.belajarspring.service.BotolService;

//import com.ats.belajarspring.service.BotolService;

@Controller
public class BotolController {

	 @Autowired
	  private BotolService botolService;
	 
	@RequestMapping(value="tambah_botol")
	public String menuTambah() {
		String html="botol/tambah_botol";
		return html;
	}
	
	@RequestMapping(value="hasil_satu_botol")
	public String hasilSatuBotol(HttpServletRequest request, Model model) {
		
		int nomorBotol = Integer.valueOf(request.getParameter("nomor"));
		String namaBotol = request.getParameter("nama");
		
		BotolModel botolModel = new BotolModel();
		botolModel.setNomorBotol(nomorBotol);
		botolModel.setNamaBotol(namaBotol);
		
		
		botolService.create(botolModel);
		
		model.addAttribute("botolModel", botolModel); 
		
		
		String html="botol/satu_botol";
		return html;
	}
}
