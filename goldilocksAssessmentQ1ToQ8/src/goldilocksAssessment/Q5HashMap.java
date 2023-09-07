package goldilocksAssessment;

import java.util.HashMap;
import java.util.Scanner;

public class Q5HashMap {
	
	static void findAge(String name) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Ram", 36);
        map.put("Shyam", 60); 
		if (map.containsKey(name)) {
            int age = map.get(name);
            System.out.println(name + " is " + age + " years old.");
        } else {
            System.out.println(name + " not found in the HashMap.");
        }
		
	}
	
	public static void main(String[] args) {        

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.next();
        
        findAge(name);
        
    }

}

//output:
//	Enter the name
//	Ram
//	Ram is 36 years old.

//Enter the name
//jone
//jone not found in the HashMap.
