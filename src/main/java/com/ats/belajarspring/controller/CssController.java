package com.ats.belajarspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CssController {

	@RequestMapping(value="linkcss")
	public String methodPanggilDaftar() {
		
		String html ="belajarCss/contohCss";
		return html;
		
	}
	
}
