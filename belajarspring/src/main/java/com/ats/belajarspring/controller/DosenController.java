package com.ats.belajarspring.controller;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ats.belajarspring.model.DosenModel;
import com.ats.belajarspring.service.DosenService;


@Controller
public class DosenController {

	// sebagai pengganti instance = IOC / DI
	@Autowired
	private DosenService dosenService;
	
	@RequestMapping(value="tambah_dosen")
	public String menuIsiDosen() {
		String html = "dosen/isi_dosen";
		return html;
	}
	
	
	@RequestMapping(value="hasil_satu_dosen")
	public String menuSatuDosen(HttpServletRequest request, Model model) {
		
		String namaDosen = request.getParameter("tambah_nama_dosen");
		int usiaDosen = Integer.valueOf(request.getParameter("tambah_usia_dosen"));
				
		DosenModel dosenModel = new DosenModel();
		dosenModel.setNamaDosen(namaDosen);
		dosenModel.setUsiaDosen(usiaDosen);

		// Transaksi simpan C create
		dosenService.create(dosenModel);
		// untuk memanggil method create yg ada di service
		// maka kita perlu menginstance DosenService, seperti
		// DosenService dosenService = new DosenService();
		// Agar tdk banyak menginstance class yg sama, maka digunakan autowired
		// sehingga method2 yg ada di service bisa langsung dipanggil saja
		
	
		model.addAttribute("dosenModel", dosenModel);
		
		String html = "dosen/satu_dosen";
		return html;
	}
	
	@RequestMapping(value="hasil_banyak_dosen")
	public String menuBanyakDosen(Model model) {
		
		// bagian list data
		List<DosenModel> dosenModelList = new ArrayList<DosenModel>();
		dosenModelList = dosenService.read();
		model.addAttribute("dosenModelList", dosenModelList);
		
		String html = "dosen/banyak_dosen";
		return html;
	}
	
	@RequestMapping(value="hasil_banyak_dosen_order_nama")
	public String menuBanyakDosenOrderNama(Model model) {
		
		// bagian list data
		List<DosenModel> dosenModelList = new ArrayList<DosenModel>();
		dosenModelList = dosenService.readOrderNama();
		model.addAttribute("dosenModelList", dosenModelList);
		
		String html = "dosen/banyak_dosen_order_nama";
		return html;
	}
	
	@RequestMapping(value="order_dosen")
	public String menuOrderDosen(Model model) {
		
		// bagian list data
		List<DosenModel> dosenModelList = new ArrayList<DosenModel>();
		dosenModelList = dosenService.readOrderBy();
		model.addAttribute("dosenModelList", dosenModelList);
		
		String html = "dosen/order_dosen";
		return html;
	}
	
	@RequestMapping(value="cari_nama_dosen")
	public String menuCariNamaDosen(Model model) {
		
		// bagian list data
		List<DosenModel> dosenModelList = new ArrayList<DosenModel>();
		dosenModelList = dosenService.readOrderBy();
		model.addAttribute("dosenModelList", dosenModelList);
		
		String html = "dosen/cari_nama_dosen";
		return html;
	}
	
	@RequestMapping(value="proses_cari_nama")
	public String menuProsesCariNamaDosen(HttpServletRequest request, Model model) {
		String kataKunci = request.getParameter("katakunci_nama");
		
		// bagian list data
		List<DosenModel> dosenModelList = new ArrayList<DosenModel>();
		dosenModelList = dosenService.readWhereNama(kataKunci);
		model.addAttribute("dosenModelList", dosenModelList);
		
		String html = "dosen/cari_nama_dosen";
		return html;
	}
}
