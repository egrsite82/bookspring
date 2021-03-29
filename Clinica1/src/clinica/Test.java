package clinica;

import java.util.ArrayList;

public class Test {
	
	
	 public static void testObjects() {
	  
	  // create an object: instantiate 
	 Person jose = new Person("José Espejo", 1,1,1950);
	  
	  
	  System.out.println(jose);
	  
	  jose.setWeight(180); jose.setHeight(180);
	  
	  Clinica quiron = new Clinica("Quiron Clinic", 50);
	  
	  System.out.println(quiron);
	  
	  System.out.println("Index of " + jose.getName() + " " + jose.weightIndex());
	  System.out.println("isAccepted as a member? " + quiron.isAccepted(jose));
	  
	  quiron.addAsMember(jose);
	  
	  System.out.println(quiron);
	  
	  }
	 	
	 public static void testConstructorMethod() {
		
		//from Person we create an object called Toni with a static method which call
		  // to the REAL constructor
		  Person toni =  Person.personConstructorAge("Toni Lopez", 18, 1,1,1980);
		
		  Person laura = Person.personConstructorWeigth("Laura Gasol", 60, 1,7,1992);
		
		 
		 //object without tag, that is reference variable and thus I cant call this object
		  //this object will be an lost object
		  //this is a very BAD IDEA we are creating a zombie
		//Person.personConstructorAge("Toni Lopez", 18, 1,1,1980);
		
		System.out.println(laura);
		System.out.println(toni);
		
	}

	 //to test student branch from Person
	 public static void testObjectsStudent() {
		 
		 //without teacher so far
		 Course javase = new Course("Java Standard Edition", 100, 2021);
		 Course javaee = new Course("Java Enterprise Edition", 150, 2021);
		 Course javaspring = new Course("Java Spring Boot", 180, 2021);
		 Course jpa = new Course("Java Persistence Api", 80, 2021);
		 
		 Student laia = new Student ("Laia Gomis",3, 2, 1859, 2020, 300  );
		 
		 System.out.println("\n" + laia);
		 
		 laia.addCourse(jpa);
		 laia.addCourse(javase);
		 laia.addCourse(javaee);
		 laia.addCourse(javaspring);
		 
		 System.out.println("\n" + laia);
		 
		 laia.setBasicSalary(450);
		 
		 System.out.println("\n" + laia);
		 
	 }
	 
	 //to test employee branch from Person (employee, teacher and doctor)
	 public static void testUtilitiesInherence() {
		 
		 Employee boris = new Employee("Borislav", 5,5,1990, 400, 550 );
		 
		 //System.out.println("\n" + boris);
		 
		 //without teacher so far
		 Course javase = new Course("Java Standard Edition", 100, 2021);
		 Course javaee = new Course("Java Enterprise Edition", 150, 2021);
		 Course javaspring = new Course("Java Spring Boot", 180, 2021);
		 Course jpa = new Course("Java Persistence Api", 80, 2021);
		 
		 Student laia = new Student ("Laia Miramunt", 3, 2, 1985, 2020, 550);
		 				 
		 laia.addCourse(jpa);
		 laia.addCourse(javase);
		 laia.addCourse(javaee);
		 laia.addCourse(javaspring);
		 		

		 
		 laia.setBasicSalary(450);
		 
		 
		 
		 Person jose = new Person("José Espejo", 1,1,1950);
		 
		 jose.setBasicSalary(1200);
		 
		    
		 jose.setWeight(180);
		 jose.setHeight(180);
		 
		 ArrayList<Person> people = new ArrayList<Person>();
		 
		 people.add(jose);
		 people.add(laia);
		 people.add(boris);
		
		// Utilities.printList(people);
		 Utilities.printListExtended(people);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
}
 