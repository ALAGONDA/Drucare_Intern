package com.drc.springboot.controller;

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

import com.drc.springboot.DTO.Employ;
import com.drc.springboot.service.EmpSer;

@RestController
@RequestMapping("/app")
public class EmpCont {

	@Autowired
	private EmpSer empser;

	@PostMapping("/insertemploy")
	public Employ insert(@RequestBody Employ emp) {

		Employ employ = empser.insert(emp);

		return employ;
	}

	@GetMapping("/fetchall")
	public List<Employ> fetch() {
		List<Employ> fetch = empser.fetch();

		return fetch;
	}
	
	@PutMapping("/update")
	public Employ updateEmploy(@RequestBody Employ emp)
	{
		Employ upda = empser.update(emp);
		return upda;
	}
	
	@DeleteMapping("/remove/{id}")
	public void delete(@PathVariable int id) {
		
		empser.delete(id);
		
	}
	
	
	
	
	
	
	
	

}
