package clinica;

public class Test {
	
	//let's create and test some objects Person and Clinica
	//and add Person Jose to Clinica as a Member
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
	 
	//let's create and test some objects Person with the
	//same ORDER arguments which may cause trouble at constructor
	//so we will create two methods which will call the constructor
	//and return and Person object
	//so: call method > method > call constructor > create object > method return object
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

}
