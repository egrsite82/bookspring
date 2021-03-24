package clinica;

public class TestClinica {

	public static void main(String[] args) {


		Person jose = new Person("José Espejo", 1,1,1950);
		
		
		System.out.println(jose);
		
		jose.setWeight(180);
		jose.setHeight(180);
		
		Clinica quiron = new Clinica("Quiron Clinic", 50);
		
		System.out.println(quiron);
		
		System.out.println("Index of " + jose.getName() + " " + jose.weightIndex());
		System.out.println("isAccepted as a member? " + quiron.isAccepted(jose));
		
		quiron.addAsMember(jose);
		
		System.out.println(quiron);

	}

}
