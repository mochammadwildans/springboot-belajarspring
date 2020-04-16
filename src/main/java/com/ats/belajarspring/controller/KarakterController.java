package com.ats.belajarspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ats.belajarspring.model.KarakterModel;


@Controller
public class KarakterController {

	@RequestMapping(value="tambah_karakter")
	public String menuIsiDosen() {
		String html = "karakter/isi_karakter";
		return html;
	}
	
	@RequestMapping(value="hasil_satu_karakter")
	public String menuSatuKarakter(HttpServletRequest request, Model model) {
		
		// get data dari textfield di frontend isi_karakter.html
		String namaKarakter = request.getParameter("tambah_nama");
		int levelKarakter = Integer.valueOf(request.getParameter("tambah_level"));
		String statusKarakter = request.getParameter("tambah_status");
		
		// set data ke model
		KarakterModel karakterModel = new KarakterModel();
		karakterModel.setNama(namaKarakter);
		karakterModel.setLevel(levelKarakter);
		karakterModel.setStatus(statusKarakter);
		
		// untuk lempar data ke frontend satu_karakter.hml
		model.addAttribute("karakterModel", karakterModel);
		
		// mapping
		String html = "karakter/satu_karakter";
		return html;
	}

}
