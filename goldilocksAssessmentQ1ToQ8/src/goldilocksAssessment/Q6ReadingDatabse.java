package goldilocksAssessment;



public class Q6ReadingDatabse {
	
//	Using Springboot i did this Question 
	
//	------>Controller code
	
//	@GetMapping("/getByName/{name}")
//	public String getAllVehicleDetails(@RequestParam("name") String name){
//		EmployeeGoldi emp=empServ.getByName(name);
//		if(emp!=null)
//		return "name: "+emp.getEmpName()+ " Age :"+emp.getEmpAge();
//		else
//			return "No data found with name :"+ name;
//	}
	
//	-------->service code
	
//	@Override
//	public EmployeeGoldi getByName(String name) {
//		EmployeeGoldi emp=dao.findByEmpName(name);
//		return emp;
//	}
	
	
//	output:
//		input  : nav
//		output : No data found with name :nav
//		input  : Rakesh
//		output : name: Rakesh Age :25
//		
//		database table:
//			mysql> select * from employee_goldi;
//			+--------+---------+----------+
//			| emp_id | emp_age | emp_name |
//			+--------+---------+----------+
//			|      1 |      25 | Rakesh   |
//			|      2 |      27 | Naveen   |
//			|      3 |      28 | Sampath  |
//			+--------+---------+----------+
//			3 rows in set (0.00 sec)
		

}
