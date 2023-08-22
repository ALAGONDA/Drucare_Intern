package com.drc.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drc.springboot.DAO.EmpDao;
import com.drc.springboot.DTO.Employ;

@Service
public class EmpSer {
	
	@Autowired
	private EmpDao empdao;

	public Employ insert(Employ emp) {
		 Employ employ = empdao.insert(emp);
		 
		 return employ;
		
	}

	public List<Employ> fetch() {
		List<Employ> fetch = empdao.fetch();
		
		return fetch;
		
	}

	public Employ update(Employ emp) {
		
		Employ updt = empdao.update(emp);
		
		return updt;
	}

	public void delete(int id) {
		empdao.delete(id);
		
	}

}
