package com.ats.belajarspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KaryawanController {

	@RequestMapping(value="karyawan/linkdaftar")
	public String panggilDaftar() {
		String html="karyawan/daftar";
		return html;
	}
	
	@RequestMapping(value="karyawan/linkhasil")
	public String panggilHasil(HttpServletRequest request, Model model) {
		String nama = request.getParameter("daftar_nama");
		String jabatan = request.getParameter("daftar_jabatan");
		
		model.addAttribute("hasil_nama", nama);
		model.addAttribute("hasil_jabatan", jabatan);
		
		String html="karyawan/hasil";
		return html;
	}
	
}
