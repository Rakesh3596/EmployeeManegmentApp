package goldilocksAssessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q3DatabaseReader {
	public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/goldilocksEmp";
        String username = "root";
        String password = "root";

        String mysqlQuery = "SELECT emp_name, emp_age FROM employee_goldi";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet res = statement.executeQuery(mysqlQuery);

            while (res.next()) {
                String name = res.getString("emp_name");
                int age = res.getInt("emp_age");

                System.out.println("Employee Name: " + name);
                System.out.println("Employee Age: " + age);
                
                System.out.println("-------------------------------");
            }

            res.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

//output:
//	Employee Name: rakesh
//	Employee Age: 25
//	-------------------------------
//	Employee Name: Naveen
//	Employee Age: 27
//	-------------------------------
//	Employee Name: Sampath
//	Employee Age: 28
//	-------------------------------
