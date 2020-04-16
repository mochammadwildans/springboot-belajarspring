package com.ats.belajarspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HalamanController {

	@RequestMapping(value="linkganti")
	public String methodPanggilGanti() {
		
		String html ="ganti";
		return html;
		
	}
	
	@RequestMapping(value="linkbaru")
	public String methodPanggilBaru() {
		
		String html ="baru";
		return html;
		
	}
	
	@RequestMapping(value="linksatu")
	public String methodPanggilSatu() {
		
		String html ="kelompok/satu";
		return html;
		
	}
	
}
