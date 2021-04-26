package test;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMapExample {
	
	public static void main(String[] args) {

	//Create a hashmap
		
		Map<String,Integer> numberMapping = new HashMap<>();
		
		numberMapping.put("Monday", 1);
		numberMapping.put("Tuesday", 2);
		numberMapping.put("Sudnay", 7);
		
		numberMapping.putIfAbsent("Saturday", 6);
		
		System.out.println(numberMapping);
		
		
		
	}
}
