package com.drc.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drc.springboot.DTO.Employ;

@Repository
public interface EmpRepo extends JpaRepository<Employ, Integer>{

}
