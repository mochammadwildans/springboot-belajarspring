package com.ats.belajarspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CpnsController {

	@RequestMapping(value="menudaftar")
	public String methodPanggilDaftar() {
		
		String html ="cpns/daftar";
		return html;
		
	}
	
	@RequestMapping(value="menuhasil")
	public String methodPanggilHail(HttpServletRequest request, Model model) {
		
		//mengambil data dari frontend ke backend
		String nama = request.getParameter("daftar_nama");
		String tanggal = request.getParameter("daftar_tanggal");
		String kota = request.getParameter("daftar_kota");
		String jk = request.getParameter("daftar_jk");
		String alamat = request.getParameter("daftar_alamat");
		
		System.out.println(nama);
		System.out.println(tanggal);
		System.out.println(kota);
		System.out.println(jk);
		System.out.println(alamat);
		
		//mengambil data dari backend ke frontend
		model.addAttribute("hasil_nama", nama);
		model.addAttribute("hasil_tanggal", tanggal);
		model.addAttribute("hasil_kota", kota);
		model.addAttribute("hasil_jk", jk);
		model.addAttribute("hasil_alamat", alamat);
		String html ="cpns/hasil";
		return html;
		
	}
	
}
