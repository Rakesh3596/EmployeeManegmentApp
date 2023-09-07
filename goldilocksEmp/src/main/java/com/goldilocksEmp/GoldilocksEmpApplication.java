package com.goldilocksEmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.goldilocksEmp.controller.EmpController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class GoldilocksEmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoldilocksEmpApplication.class, args);
		
	}

}
