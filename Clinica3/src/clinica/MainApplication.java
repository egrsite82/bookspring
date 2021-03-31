package clinica;

import java.util.Scanner;

public class MainApplication {
	
	public static void main(String[] args) {
		
		//init, in this case, reader and handle events: while
		System.out.println("loading ...."  + "\n");
		Scanner reader = new Scanner(System.in);	
			
	    while (true) {
	    	
	    	//our menu and I/0 system, that is view
	    	String command = menuView(reader);
	        	               
	        //our controller, handle operations and request,
	    	//deliver responses, handle traffic and events
	        int resultOperation = controller(command);
	        
	        if (resultOperation == 0) break;
	        
	    }
	
		reader.close();
	   	System.out.println("finishing ....\n" + "\n");

	}
	
	//MVC >>> view
	private static String menuView (Scanner reader) {
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
        
        return command;
		
	}
	
	//MVC >>> controller
	private static int controller (String command) {
		
		int resultOperation = -1;
		
		if (command.equals("0")) {
			resultOperation = 0;
		} else if (command.equals("1")) {
			Test.testObjectsPerson();
			resultOperation = 1;
        } else if (command.equals("2")) {
        	Test.testConstructorMethod();
        	resultOperation = 2;
        } else if (command.equals("3")) {
        	Test.testObjectsStudent();
        	resultOperation = 3;
        } else if (command.equals("4")) {
        	Test.testUtilitiesInherence();
        	resultOperation = 4;
        } else if (command.equals("5")) {
        	Test.testObjectsCourse();
        	resultOperation = 5;
        } else if (command.equals("6")) {
        	Test.testClinicaMembersArray();
        	resultOperation = 6;
        } else {
        	System.out.println("Unknown command!");
        	resultOperation = 7;
        }
		
		return resultOperation;
	}

}


