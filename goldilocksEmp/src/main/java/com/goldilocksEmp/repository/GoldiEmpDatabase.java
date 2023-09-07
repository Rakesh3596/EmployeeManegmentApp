package com.goldilocksEmp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goldilocksEmp.model.EmployeeGoldi;

@Repository
public interface GoldiEmpDatabase extends JpaRepository<EmployeeGoldi, Integer>{
	
	public EmployeeGoldi findByEmpName(String name);

}
