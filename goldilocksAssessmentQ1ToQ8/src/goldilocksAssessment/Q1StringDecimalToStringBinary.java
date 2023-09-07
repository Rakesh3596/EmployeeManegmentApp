package goldilocksAssessment;

import java.util.Scanner;

public class Q1StringDecimalToStringBinary {
	
	public static String decimalStringToBinaryString(String decimalString) {
        try {
            int decimalValue = Integer.parseInt(decimalString);

            String binaryString = Integer.toBinaryString(decimalValue);

            return binaryString;
        } catch (NumberFormatException exp) {
            return "Invalid input provid decimal string value";
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal String");
        String decimalString = sc.next();
        String binaryResult = decimalStringToBinaryString(decimalString);
        System.out.println("Binary representation of " + decimalString + " is: " + binaryResult);
    }
    
//    result:
//    	Enter the decimal String
//    	123
//    	Binary representation of 123 is: 1111011
    
//       Enter the decimal String
//       abc
//       Binary representation of abc is: Invalid input provid decimal string value

}
