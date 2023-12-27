package com.goldilocksEmp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.goldilocksEmp.model.EmployeeGoldi;
import com.goldilocksEmp.service.EmpService;



@RestController
public class EmpController {
	
	@Autowired
	EmpService empServ;
	
	@PostMapping("/addEmpGoldiLocks")
	public ResponseEntity<EmployeeGoldi> addEmp(@RequestBody EmployeeGoldi emp){
		EmployeeGoldi empreg= empServ.addEmp(emp);
		
		return new ResponseEntity<>(empreg,HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/getAllEmployeeFromGoldiLocks")
	public ResponseEntity<List<EmployeeGoldi>> getAllVehicleDetails(){
		List<EmployeeGoldi> allemp=empServ.getAllEmp();
		return new ResponseEntity<List<EmployeeGoldi>>(allemp,HttpStatus.OK);
		
	}
	
	@GetMapping("/getByName/{name}")
	public String getAllVehicleDetails(@RequestParam("name") String name){
		EmployeeGoldi emp=empServ.getByName(name);
		if(emp!=null)
		return "name: "+emp.getEmpName()+ " Age :"+emp.getEmpAge();
		else
			return "No data found with name :"+ name;
	}

}
