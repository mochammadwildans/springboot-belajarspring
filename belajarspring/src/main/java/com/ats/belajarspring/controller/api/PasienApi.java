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


import com.ats.belajarspring.model.PasienModel;
import com.ats.belajarspring.service.PasienService;

@RestController
@RequestMapping("/api/pasienApi")
public class PasienApi {
	
	@Autowired
	private PasienService pasienService;
	
	// POST   |  CREATE
	// PUT    |  UPDATE
	// GET    |  READ
	// DELETE |  HAPUS
	
	@PostMapping("/post")
	@ResponseStatus(code = HttpStatus.CREATED) // Created 200
	public Map<String, Object> postApi(@RequestBody PasienModel pasienModel){ // Map Adalah Collection Dari object dan jika Method Selain Void Maka Minta Kembalian ( Return )
		
		pasienService.create(pasienModel);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Success", Boolean.TRUE);
		map.put("Notifikasi", "Selamat Data Berhasil Diinputkan");
		
		return map;
	}
	
	@PutMapping("/put/ubahYek")
	@ResponseStatus(code = HttpStatus.OK)
	public Map<String, Object> putApi(@RequestBody PasienModel pasienModel){
		pasienService.update(pasienModel);
		
		return null;
	}
	
	@GetMapping("/get/lihat")
	@ResponseStatus(code = HttpStatus.OK) // Code : HttpStatus Akan Ada Jika Sudah diBuAaaT Method Public...
	public List<PasienModel> getApi(){
		List<PasienModel> pasienModelList = new ArrayList<PasienModel>();
		pasienModelList = pasienService.baca();
		
		return pasienModelList;
	}
	
	@GetMapping("/get/{namaPasien}")
	@ResponseStatus(code = HttpStatus.OK)
	public List<PasienModel>  getApik(@PathVariable String namaPasien){
		
		 List<PasienModel> pasienModelList = new ArrayList<PasienModel>();
			pasienModelList =  pasienService.readNama(namaPasien);
			
			return pasienModelList;
	}
	
	
	@DeleteMapping("/delete/{kodePasien}")
	@ResponseStatus(code =HttpStatus.GONE)
	public Map<String, Object> delete(@PathVariable String kodePasien){
		pasienService.delete(kodePasien);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", Boolean.TRUE);
		map.put("Notif...", "Anda Berhasil Telah Menghapus Data");
		
		return map;
	}
	
	
	@DeleteMapping("/del/{kodePasien}")
	@ResponseStatus()
	public void deletes(@PathVariable String kodePasien) {
		pasienService.delete(kodePasien);
	}
	
//	@PutMapping("/put")
//	@ResponseStatus(code=HttpStatus.OK)
//	public void put(@RequestBody PasienModel pasienModel) {
//		pasienService.update(pasienModel);
//	}
		
	
	
	

}
