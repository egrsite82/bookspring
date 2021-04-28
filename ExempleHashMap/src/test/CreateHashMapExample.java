package test;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMapExample {
	
	public static void main(String[] args) {

	 ex1();
	 ex2();
		
	}
	
	public static void ex1 () {
		//Create a hashmap
		
				Map<String,Integer> numberMapping = new HashMap<>();
				
				numberMapping.put("Monday", 1);
				numberMapping.put("Tuesday", 2);
				numberMapping.put("Sudnay", 7);
				
				numberMapping.putIfAbsent("Saturday", 6);
				
				System.out.println(numberMapping);
		
	}

	public static void ex2() {
		
		
		 Map<String, String> userCityMapping = new HashMap<>();
		 
		 System.out.println("is userCityMapping empty? : " + userCityMapping.isEmpty());
		 
		  userCityMapping.put("John", "New York");
		  userCityMapping.put("Steve", "London");
		  userCityMapping.put("Toni", "Barcelona");
		  userCityMapping.put("Borislav", "Madrid");

		  System.out.println("We have the city information of " + userCityMapping.size() + " users");


		  String userName = "Erik";
	        // Check if a key exists in the HashMap
	        if(userCityMapping.containsKey(userName)) {
	            // Get the value assigned to a given key in the HashMap
	            String city = userCityMapping.get(userName);
	            System.out.println(userName + " lives in " + city);
	        } else {
	            System.out.println("City details not found for user " + userName);
	        }


	        if(userCityMapping.containsValue("New York")) {
	            System.out.println("There is a user in the userCityMapping who lives in New York");
	        } else {
	            System.out.println("There is no user in the userCityMapping who lives in New York");
	        }

	        

		
	}

}
