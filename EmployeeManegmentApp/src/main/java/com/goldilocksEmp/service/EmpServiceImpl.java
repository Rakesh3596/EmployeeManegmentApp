package com.goldilocksEmp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldilocksEmp.model.EmployeeGoldi;
import com.goldilocksEmp.repository.GoldiEmpDatabase;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	GoldiEmpDatabase dao;

	@Override
	public EmployeeGoldi addEmp(EmployeeGoldi emp) {
		return dao.save(emp);
	}

	@Override
	public List<EmployeeGoldi> getAllEmp() {
		return dao.findAll();
	}

	@Override
	public EmployeeGoldi getByName(String name) {
		EmployeeGoldi emp=dao.findByEmpName(name);
		return emp;
	}

}
