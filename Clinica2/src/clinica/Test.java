package clinica;

import java.util.ArrayList;

public class Test {
		
	 public static void testObjectsPerson() {
	  
	  // create an object: instantiate 
	 Person jose = new Person("Jos� Espejo", 1,1,1950);
	  
	  
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

	 public static void testObjectsStudent() {
		 
		 //without teacher so far
		 Course javase = new Course("Java Standard Edition", 100, 2021);
		 Course javaee = new Course("Java Enterprise Edition", 150, 2021);
		 Course javaspring = new Course("Java Spring Boot", 180, 2021);
		 Course jpa = new Course("Java Persistence Api", 80, 2021);
		 
		 Student laia = new Student ("Laia Miramunt", 3, 2, 1985, 2020, 550);
		 
		 System.out.println("\n" + laia);
		 
		 laia.addCourse(jpa);
		 laia.addCourse(javase);
		 laia.addCourse(javaee);
		 laia.addCourse(javaspring);
		 
		 System.out.println("\n" + laia);
		 
		 
		 laia.setBasicSalary(450);
		 
		 System.out.println("\n" + laia);
		 
	 }
	 
	 public static void testUtilitiesInherence() {
		 
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
		 				 
		 Person jose = new Person("Jos� Espejo", 1,1,1950);
		    
		 jose.setWeight(180);
		 jose.setHeight(180);
		
		 ArrayList<Person> people = new ArrayList<Person>();
		 
		 people.add(jose);
		 people.add(laia);
		 			 
		 //Utilities.printList(people);
		 //Utilities.printListExtended(people);
		 
		 
		 Person[] peopleClassicArray = new Person[5];
		 peopleClassicArray[0] = jose;
		 peopleClassicArray[1] = laia;
		 peopleClassicArray[2] = new Student ("Pau Lopez",10 , 8, 1995, 2020, 650);
		 peopleClassicArray[3] = new Person ("Steven Clay", 3, 2, 1978);
		 peopleClassicArray[4] = new Person ("Sebastian Bruno", new MyDate(15, 6, 1988));
		 
		 
		 Utilities.printListExtendedClassicArray(peopleClassicArray);
		 
		 
		 
		 
	 }

	 public static void testObjectsCourse() {
		 
		 
		 Course javase = new Course("Java Standard Edition", 100, 2021);
		 Course javaee = new Course("Java Enterprise Edition", 150, 2021);
		 Course javaspring = new Course("Java Spring Boot", 180, 2021);
		 Course jpa = new Course("Java Persistence Api", 80, 2021);
		 
		
		 
		 
		 Person jason = new Teacher("Jason Lagrange", 27,  02, 1972, 350, 400, 250);
		 
		 //can't be
		 //jpa.setTeacher(jason);
		 
		 // can't be, just there is not a method addCourse in Person ... 
		 //At Compilation time running environment jre or jdk looks for reference variable (tag) methods
		 //but at Execution time running environment jre or jdk looks for OBJECTS methods
		 //jason.addCourse(jpa);
		 
		 //so we need to cast the tag to be ABLE to call addCourse
		 Teacher jasonTeacher = (Teacher) jason;
		 //https://www.javaer101.com/en/article/3167045.html
		 //jpa.setTeacher(jasonTeacher);
		 
		 
		 jasonTeacher.addCourse(javase);
		 jasonTeacher.addCourse(javaee);
		 jasonTeacher.addCourse(javaspring);
		 jasonTeacher.addCourse(jpa);
		 
		 //both reference variables TAGS point the same object
		 //if not MAY test with	EQUALS
		 System.out.println(jason + "\n");
		 System.out.println(jasonTeacher + "\n");
		 
		 //to test add a teacher to course
		 //https://www.javaer101.com/en/article/3167045.html
		 Course sqlManytoMany = new Course("JPA many to many relashionship causing infinite recursion", 10, 2021);
		 sqlManytoMany.setTeacher(jasonTeacher);
		 
	 }

}
