package exempleJava;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		
		
		Scanner inputdata = new Scanner(System.in);
		
		
		System.out.println("Long live java");
		
		String tellmeyourname = inputdata.nextLine();
		
		boolean samename = tellmeyourname.equals("toni");
		System.out.println(samename);
		System.out.println("Your name is ... "+  tellmeyourname);
		
		
		
		
	}

}
