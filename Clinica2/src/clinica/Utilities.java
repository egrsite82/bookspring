package clinica;

import java.util.ArrayList;

public class Utilities {
	
	public static void printList (ArrayList<Person> people) {
		
		System.out.println("\n\n People");
		System.out.println("------------------------------------------------------------");
		
		for (Person person : people) {
			System.out.println(person);
		}
	}

	
	public static void printListExtended (ArrayList<Person> people) {
		
		System.out.println("\n\n  People");
		System.out.printf("%-8s %-15s %-30s \n","Salary", "Name", "Birthdate");
		System.out.println("------------------------------------------------------------");
		
		//https://docs.oracle.com/javase/1.5.0/docs/api/java/util/Formatter.html
		for (Person person : people) {
			System.out.printf("%8.2f %-15s %-30s \n", person.getSalary(), person.getName(),person.getBirthMyDate());	
		}
	}
	
	public static void printListExtendedClassicArray(Person[] people) {
		System.out.println("\n\n People");
		System.out.println("------------------------------------------------------------");
		
		for (Person person : people) {
			System.out.println(person);
		}
	}
	
}