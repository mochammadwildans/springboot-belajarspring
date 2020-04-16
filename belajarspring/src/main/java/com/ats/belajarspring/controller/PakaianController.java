package com.ats.belajarspring.controller;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ats.belajarspring.model.PakaianModel;
import com.ats.belajarspring.service.PakaianService;

@Controller
public class PakaianController {
	
	@Autowired
	private PakaianService pakaianService;
	
	@RequestMapping(value="tambah_pakaian")
	public String menuTambahPakaian(Model model) {
		String Html="pakaian/tambah_pakaian";
		return Html;
	}
	
	@RequestMapping(value="proses_satu_pakaian")
	public String SatuPakaian(HttpServletRequest request, Model model) {
		String kodePakaian = request.getParameter("kodePakaian");
		String namaPakaian = request.getParameter("namaPakaian");
		int hargaPakaian = Integer.valueOf(request.getParameter("hargaPakaian"));
		int ukuran = Integer.valueOf(request.getParameter("ukuran"));
		
		
		PakaianModel pakaianModel = new PakaianModel();
		pakaianModel.setKodePakaian(kodePakaian);
		pakaianModel.setNamaPakaian(namaPakaian);
		pakaianModel.setHargaPakaian(hargaPakaian);
		pakaianModel.setUkuran(ukuran);
		
		pakaianService.create(pakaianModel);
		
		model.addAttribute("pakaianModel", pakaianModel);
		
		String Html="pakaian/satu_pakaian";
		return Html;
	}
	
	@RequestMapping(value="hasil_banyak")
	public String menuBanyakPakaian(Model model) {
	
		// bagian list data
		List<PakaianModel> pakaianModelList = new ArrayList<PakaianModel>();
		pakaianModelList = pakaianService.read();
		model.addAttribute("pakaianModelList", pakaianModelList);
		
		String html = "pakaian/daftar_pakaian";
		return html;
	}

	@RequestMapping(value="hasil_pakaian_murah")
	public String menuBanyakPakaianOrder(Model model) {
		
		// bagian list data
		List<PakaianModel> pakaianModelList = new ArrayList<PakaianModel>();
		pakaianModelList = pakaianService.readOrderNama();
		model.addAttribute("pakaianModelList", pakaianModelList);
		
		String html = "pakaian/banyak_pakaian_murah";
		return html;
	}
	
}
