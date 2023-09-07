package goldilocksAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Q4CallUrl {
	
	 public static void main(String[] args) {
	        String st = "http://localhost:8888/getAllEmployeeFromGoldiLocks";

	        try {
	            URL url = new URL(st);
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod("GET");

	            int responseCode = connection.getResponseCode();
	            System.out.println("Response Code: " + responseCode);

	            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	            String inputLine;
	            StringBuilder res = new StringBuilder();

	            while ((inputLine = br.readLine()) != null) {
	            	res.append(inputLine);
	            }
	            br.close();

	            System.out.println("Response Data:");
	            System.out.println(res.toString());

	            connection.disconnect();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
