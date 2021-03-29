package clinica;

/**
* <h1>This class Person handle People, that is,
* teachers, employee, etc</h1>
* 
* <p>
* <b>Note:</b> 
* 
* </p>
* 
* @author  Jaume Viladoms Java Course
* @version 1.0
* @since   2021-03-01
*/


//https://docs.oracle.com/javase/7/docs/api/stylesheet.css
public class Person {
	
	// class fields of person
	private String name;
	//it could be a method with now-birthdate
	private int age;
	private int height;
	private int weight;
	//composition relationship
	private MyDate birthMyDate;
	//change visibility to private to see what happen
	protected double basicSalary;
	
	//default constructor
	public Person() {}

	public Person(String name) {
		this(name, 0); // run here the other constructor's code and set the age parameter to 0
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.weight = 0;
		this.height = 0;
	}
	
	public Person(String name, int height, int weigth) {
		this.name = name;
		this.age = 0;
		this.weight = weigth;
		this.height = height;
	}

	public Person(String name, int day, int month, int year) {
		this.name = name;
		this.weight = 0;
		this.height = 0;
		this.birthMyDate = new MyDate(day, month, year);
	}
	
	public Person(String name, int day, int month, int year, double basicSalary) {
		this.name = name;
		this.weight = 0;
		this.height = 0;
		this.basicSalary = basicSalary;
		this.birthMyDate = new MyDate(day, month, year);
	}
	
	public Person(String name, MyDate date) {
		this.name = name;
		this.weight = 0;
		this.height = 0;
		this.birthMyDate = date;
	}
	
	//be CAREFUL cause this is not a constructor BUT it acts as if
	//https://en.wikipedia.org/wiki/Builder_pattern
	public static Person personConstructorAge (String name, int age, int day, int month, int year) {
		
		Person createPersonWithAge = new Person(name, day, month, year);
		createPersonWithAge.setAge(age);
		
		return createPersonWithAge;
	}
	
	public static Person personConstructorWeigth (String name, int weigth, int day, int month, int year) {
		
		Person createPersonWithWeigth = new Person(name, day, month, year);
		createPersonWithWeigth.setWeight(weigth);
		
		return createPersonWithWeigth;
	}
	
	public double getSalary () {
		return basicSalary;
	}

	public void printPerson() {
		System.out.println(this.name + " I am " + this.age + " years old");
	}

	public void becomeOlder() {
		this.age++;
	}

	public void becomeOlder(int years) {
		this.age = this.age + years;
	}

	public boolean isAdult() {
		if (this.age < 18) {
			return false;
		}

		return true;
	}

	//sometimes it returns NaN not a number
	public double weightIndex() {
		double heightInMeters = this.height / 100.0;

		return this.weight / (heightInMeters * heightInMeters);
	}
	
	public boolean olderThan(Person compared) {
		if (this.age > compared.age) {
			return true;
		}

		return false;
	}
	
	//toString done by ME, it is not the default toString
	public String toString() {
		return this.name + " I am " + this.age + " years old, my weight index is " + this.weightIndex() + ", born "
				+ this.birthMyDate;
	}

	//setters and getters
	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public MyDate getBirthMyDate() {
		return birthMyDate;
	}

	public void setBirthMyDate(MyDate birthMyDate) {
		this.birthMyDate = birthMyDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	

}
