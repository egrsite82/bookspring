package clinica;


import java.util.Scanner;

public class MainApplication {
	
	public static void main(String[] args) {
		
		System.out.println("loading ...."  + "\n");
		Scanner reader = new Scanner(System.in);	
			
	    while (true) {
	    	
	    	System.out.println("\nChoose one option ...");
	    	System.out.println("0 - Quit");
	    	System.out.println("1 - test Objects Person ");
	    	System.out.println("2 - test Constructor Method Person");
	    	System.out.println("3 - test Object Student");
	    	System.out.println("4 - test Utilities Inherence Class Person");
	    	System.out.println("5 - test Objects Course: Teacher/Student");
	    	
	    	System.out.println("\noption? ");
	        String command = reader.nextLine();
	        Utilities.clear();
	
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
	        } else {
	        	System.out.println("Unknown command!");
	        }
	    }
	

		 
		//Test.testObjectsPerson();
		//Test.testConstructorMethod();
		//Test.testObjectsStudent();
		//Test.testUtilitiesInherence();
		//Test.testObjectsCourse();
	    
		reader.close();
	    
		System.out.println("finishing ....\n" + "\n");

	}
	
	
	

}
