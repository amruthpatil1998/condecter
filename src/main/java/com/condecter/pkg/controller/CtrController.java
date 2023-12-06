package com.condecter.pkg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.condecter.pkg.entity.Condecter;
import com.condecter.pkg.service.CtrService;

@RestController
@RequestMapping("/codecter")
public class CtrController {

	@Autowired
	CtrService csmrService;

	@GetMapping("/Test")
	public String Test() {
		return "Hi Well Come";
	}

	@PostMapping("/retister")
	public String CsmrRetistration(@RequestBody Condecter csmr) {
		String TiketConferom = csmrService.CsmrResister(csmr);
		return TiketConferom;
	}

	@GetMapping("/getId/{id}")
	public Condecter getById(@PathVariable("id") int id) {
		Condecter csmr = csmrService.getById(id);
		return csmr;
	}
	
	@GetMapping("/getAll")
	public List<Condecter> getAll(){
		return csmrService.getAll();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") int id) {
		csmrService.deletById(id);
	}
	
	@PutMapping("/update/{id}")
	public Condecter update(@PathVariable("id") int id,@RequestBody Condecter c){
		
		return csmrService.update(id,c);
		
	}

}
