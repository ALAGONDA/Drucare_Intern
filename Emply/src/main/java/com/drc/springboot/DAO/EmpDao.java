package com.drc.springboot.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.drc.springboot.DTO.Employ;
import com.drc.springboot.repository.EmpRepo;

@Repository
public class EmpDao  {

	@Autowired
	public EmpRepo empRepo;

	public Employ insert(Employ emp) {

		Employ employ = empRepo.save(emp);

		return employ;

	}

	public List<Employ> fetch() {

		List<Employ> findAll = empRepo.findAll();

		return findAll;

	}

	public Employ update(Employ emp) {
		
		Optional<Employ> findById = empRepo.findById(emp.getId());
		
		if (findById.isPresent()) {
			
		return	empRepo.save(emp);
			
		} 
		return null;
		
		
	}

	public void delete(int id) {
		empRepo.deleteById(id);
		
	}

}
