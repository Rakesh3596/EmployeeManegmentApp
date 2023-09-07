package goldilocksAssessment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q2CSVfile {
	
	public static int  readCSVFile(String filepath) {
		int sum=0;
		try {
			Scanner sc=new Scanner(new File(filepath));
			
			while(sc.hasNext()) {
				String v=sc.next();
				int intVal=Integer.parseInt(v);
				
				sum+=intVal;
				
			}
			System.out.println(sum);
			sc.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sum;
		
	}
	    public static void main(String[] args) {
	      String inputPath= "E:\\goldilocksQ\\csvinput.csv";
	      int res=readCSVFile(inputPath);
	      
	      
	      try {
			PrintWriter pw=new PrintWriter(new File("E:\\goldilocksQ\\csvOutput.csv"));
			StringBuilder sb= new StringBuilder();
			sb.append("Sum of Value :"+res);
			
			pw.write(sb.toString());
			System.out.println("Result stored in output file");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      
	    }
}

//output:
//	input given : 2 3 4 
//	output :
//		9
//		Result stored in output file

