package day4.EmployeeWithEncapsulation;

public class Employee {
	
	private String name;
	private double salary;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			System.out.println("Invalid name.");
			return;
		}
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		if (salary < 10000 || salary > 500000) {
			System.out.println("Invalid salary. ");
			return;
		}
		this.salary = salary;
	}
	
	public void raise(double percent) {
		if (percent < 0 || percent > 100) {
			System.out.println("Invalid raise. ");
			return;
		}
		salary = salary + (salary * percent / 100);
	}
	

}
