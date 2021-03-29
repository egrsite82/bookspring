package clinica;

public class Employee extends Person {

	protected double salaryEmployee;

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int day, int month, int year,  double basicSalary, double salaryEmployee) {
		super(name, day, month, year, basicSalary);
		this.salaryEmployee = salaryEmployee;
	}

	public Employee(String name, int height, int weigth) {
		super(name, height, weigth);
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Employee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalary() {
		return salaryEmployee + basicSalary;
	}
	
	public double getSalaryEmployee() {
		return salaryEmployee;
	}

	public void setSalary(double salaryEmployee) {
		this.salaryEmployee = salaryEmployee;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + this.getSalary() + " salaryEmployee: " + salaryEmployee + " basicSalary: " + basicSalary + "]"
				+ "\n " +  super.toString();
	}
	
	
}
