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

import com.ats.belajarspring.model.DokterModel;
import com.ats.belajarspring.service.DokterService;

@RestController
@RequestMapping("api")
public class DokterApi {
	
	@Autowired
	DokterService dokterService;
	
	@PostMapping("/post1")
	@ResponseStatus(code = HttpStatus.OK)
	public Map<String, Object> postApi(@RequestBody DokterModel dokterModel){
		dokterService.create(dokterModel);
		
		Map<String, Object> dk = new HashMap<String, Object>();
		dk.put("succes", Boolean.TRUE);
		dk.put("Notif", "Berhasil DiinPUUuT...");
		
		return dk;
	}
	
	@PostMapping("/post2")
	@ResponseStatus(code = HttpStatus.OK)
	public void postApis(@RequestBody DokterModel dokterModel){
		dokterService.create(dokterModel);
		
	}
	
	
	@GetMapping("/get1")
	@ResponseStatus(code = HttpStatus.OK)
	public List<DokterModel> getApi(){
		List<DokterModel> dokteModelList = new ArrayList<DokterModel>();
		dokteModelList= dokterService.read();
		
		return dokteModelList;
		
	}
	
	@GetMapping("/get2")
	@ResponseStatus(code = HttpStatus.OK)
	public void getApis(@RequestBody DokterModel dokterModel) {
		dokterService.read(dokterModel);
	}
	
	@GetMapping("/get3/{nameDoct}")
	@ResponseStatus(code = HttpStatus.OK)
	public void getApik(@PathVariable String nameDoct){
		dokterService.readNama(nameDoct);
		
		
	}
	
	
	@PutMapping("/put1")
	@ResponseStatus(code = HttpStatus.OK)
	public Map<String, Object> putApi(@RequestBody DokterModel dokterModel){
		dokterService.update(dokterModel);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Success", Boolean.TRUE);
		map.put("Notif", "Berhasil DiUbah...");
		
		return map;
	}
	
	@PutMapping("/put2")
	@ResponseStatus(code = HttpStatus.OK)
	public void putApis(@RequestBody DokterModel dokterModel) {
		dokterService.update(dokterModel);
	}
	
	@DeleteMapping("/delete1/{idDoct}")
	@ResponseStatus(code = HttpStatus.GONE)
	public Map<String, Object> deleteApi(@PathVariable Integer idDoct){
		dokterService.delete(idDoct);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Success", Boolean.TRUE);
		map.put("Notifikasi", "Kamu Telah Menghapus Data...");
		
		return map;
	}
	
	@DeleteMapping("/delete2/{idDoct}")
	@ResponseStatus(code = HttpStatus.GONE)
	public void deleteApis(@PathVariable Integer idDoct) {
		dokterService.delete(idDoct);
	}

}
