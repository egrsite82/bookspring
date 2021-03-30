package clinica;

public class Doctor extends Employee {
	
	private String speciality;
	private double salaryAsDoctor;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(String name, int day, int month, int year, double basicSalary, double salaryEmployee) {
		super(name, day, month, year, basicSalary, salaryEmployee);
		// TODO Auto-generated constructor stub
	}
	public Doctor(String name, int height, int weigth) {
		super(name, height, weigth);
		// TODO Auto-generated constructor stub
	}
	public Doctor(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public Doctor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public Doctor(String speciality, double salaryAsDoctor) {
		super();
		this.speciality = speciality;
		this.salaryAsDoctor = salaryAsDoctor;
	}
	
	@Override
	public double getSalary () {
		return salaryAsDoctor;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public double getSalaryAsDoctor() {
		return salaryAsDoctor;
	}
	public void setSalaryAsDoctor(double salaryAsDoctor) {
		this.salaryAsDoctor = salaryAsDoctor;
	}
	@Override
	public String toString() {
		return "Doctor [speciality=" + speciality + ", salaryAsDoctor=" + this.getSalary() + "]\n"+
				this.getName();
	}
	
	
	
}
