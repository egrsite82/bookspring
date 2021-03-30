package clinica;


import java.util.Scanner;

public class MainApplication {
	
	public static void main(String[] args) {
		
		System.out.println("loading ...."  + "\n");
		Scanner reader = new Scanner(System.in);	
			
	    while (true) {
	    	
	    	//In MVR pattern design this lines are considered the View tier
	    	//so we collect some data and show results to user
	    	System.out.println("\nChoose one option ...");
	    	System.out.println("0 - Quit");
	    	System.out.println("1 - test Objects Person ");
	    	System.out.println("2 - test Constructor Method Person");
	    	System.out.println("3 - test Object Student");
	    	System.out.println("4 - test Utilities Inherence Class Person");
	    	System.out.println("5 - test Objects Course: Teacher/Student");
	    	System.out.println("6 - test Clinica Members Array");
	    	
	    	System.out.println("\noption? ");
	        String command = reader.nextLine();
	        Utilities.clear();
	
	        
	        //In MVR pattern design this lines are considered the Controller tier
	    	//so we collect the requests at front controller and deliver them to
	        //where they will be processed, in our case static methods at Test Class
	        if (command.equals("0")) {
	            break;
	        } else if (command.equals("1")) {
	        	Test.testObjectsPerson();
	        } else if (command.equals("2")) {
	        	Test.testConstructorMethod();
	        } else if (command.equals("3")) {
	        	Test.testObjectsStudent();
	        } else if (command.equals("4")) {
	        	Test.testUtilitiesInherence();
	        } else if (command.equals("5")) {
	        	Test.testObjectsCourse();
	        } else if (command.equals("6")) {
	        	Test.testClinicaMembersArray();
	        } else {
	        	System.out.println("Unknown command!");
	        }
	    }
	

		 
		//Test.testObjectsPerson();
		//Test.testConstructorMethod();
		//Test.testObjectsStudent();
		//Test.testUtilitiesInherence();
		//Test.testObjectsCourse();
	    //Test.testClinicaMembersArray();
	    
		reader.close();
	    
		System.out.println("finishing ....\n" + "\n");

	}
	
	
	

}
