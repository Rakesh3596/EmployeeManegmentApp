package com.goldilocksEmp.service;

import java.util.List;

import com.goldilocksEmp.model.EmployeeGoldi;

public interface EmpService {
	
	public EmployeeGoldi addEmp(EmployeeGoldi emp);
	public List<EmployeeGoldi> getAllEmp();
	public EmployeeGoldi getByName(String name);
	
	
	

}
