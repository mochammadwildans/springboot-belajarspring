package com.ats.belajarspring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ats.belajarspring.model.SekolahModel;
import com.ats.belajarspring.service.SekolahService;


@Controller
public class SekolahController {
	
	@Autowired
	private SekolahService sekolahService;
	
	@RequestMapping (value="tambah_sekolah")
	private String menuIsiSekolah() {
		// TODO Auto-generated method stub
		String html = "sekolah/isi_sekolah";
		return html;
	}
	
	@RequestMapping(value="hasil_satu_sekolah")
	public String menuSatuSekolah(HttpServletRequest request, Model model) {
		
		int nomorSekolah = Integer.valueOf(request.getParameter("tambah_nomor"));
		String namaSekolah = request.getParameter("tambah_nama");
		
		
		SekolahModel sekolahModel = new SekolahModel();
		sekolahModel.setNomorSekolah(nomorSekolah);
		sekolahModel.setNamaSekolah(namaSekolah);
		
		sekolahService.create(sekolahModel);
		
		
		model.addAttribute("sekolahModel", sekolahModel);
		String html = "sekolah/satu_sekolah";
		return html;
	}
	
	@RequestMapping(value="hasil_banyak_sekolah")
	public String menuBanyakSekolah(Model model) {
		List<SekolahModel> sekolahModelList = new ArrayList<SekolahModel>();
		sekolahModelList = sekolahService.read();
		model.addAttribute("sekolahModelList", sekolahModelList);
		
		String html ="sekolah/banyak_sekolah";
		return html;
	}
	
	@RequestMapping (value="cari_nama_sekolah")
	public String menuCariSekolah(Model model) {
		List<SekolahModel> sekolahModelList = new ArrayList<SekolahModel>();
		sekolahModelList = sekolahService.readOrderBy();
		model.addAttribute("sekolahModelList", sekolahModelList);
		
		String html="sekolah/cari_nama_sekolah";
		return html;
	}
	
	@RequestMapping(value="hasil_cari_nama")
	public String menuProsesCariNamaSekolah(HttpServletRequest request,Model model) { 
		String cariNama = request.getParameter("cari_nama");
		
		//Bagian List Data
		List<SekolahModel> sekolahModelList = new ArrayList<SekolahModel>();
		sekolahModelList = sekolahService.readWhereNama(cariNama);
		model.addAttribute("sekolahModelList", sekolahModelList);
		
		String html="sekolah/cari_nama_sekolah";
		return html;
	}
		
}
