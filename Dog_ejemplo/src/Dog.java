
import java.util.ArrayList;

public class Dog {

	//atributes
	private String name;
	private String breed;
	private int age;
	private String color;
	
	//constructor
	public Dog (String name) {
		this.name = name;
		this.breed = "Labrador";
		this.age = 5;
		this.color = "Marron";	
	}
	
	//getter an setter
	@Override
	public String toString() {
		return "Dog name= " + getName() + ", Breed= " + getBreed() + ", Age= " + getAge() + ", Color= "
				+ getColor();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	

}
