package com.ats.belajarspring.controller.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ats.belajarspring.model.DosenModel;
import com.ats.belajarspring.service.DosenService;


@RestController
@RequestMapping("api/dosen")
public class DosenApi {

	@Autowired
	private DosenService dosenService;
	
	@PostMapping("/post")
	@ResponseStatus(code= HttpStatus.CREATED)
	public Map<String, Object> post(@RequestBody DosenModel dosenModel){
		this.dosenService.create(dosenModel);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", Boolean.TRUE);
		map.put("pesan", "Selamat Data Berhasil Dimasukkan");
		return map;
	}
	
	@GetMapping("/get")
	@ResponseStatus(code=HttpStatus.OK)
	public List<DosenModel> get(){
		List<DosenModel> dosenModelList = new ArrayList<DosenModel>();
		dosenModelList = this.dosenService.read();
		return dosenModelList;
	}
	
	@PutMapping("/put")
	@ResponseStatus(code = HttpStatus.OK)
	public Map<String, Object> put(@RequestBody DosenModel dosenModel){
		
		this.dosenService.update(dosenModel);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Success", "Data Berhasil Disimpan");
		return map;
	}
	
	
	@DeleteMapping("/delete/{namaDosen}")
	@ResponseStatus(code= HttpStatus.GONE)
	public Map<String, Object> delete (@PathVariable String namaDosen){

			dosenService.delete(namaDosen);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", Boolean.TRUE);
		map.put("Pesan", "Data Anda Telah Hilang");
		return map;
	}
	
	
}
