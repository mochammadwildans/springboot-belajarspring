package com.ats.belajarspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApaController {

	@RequestMapping(value="apadaftar")
	public String panggil1() {
		String html = "apa/daftar";
		return html;
	}
	
	@RequestMapping(value="apahasil")
	public String panggil(HttpServletRequest request, Model model) {
		String apa = request.getParameter("daftar_apa");
		
		model.addAttribute("hasil_apa", apa);
		
		String html = "apa/hasil";
		return html;
	}
	
}
