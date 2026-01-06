package day4.EmployeeWithEncapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setName("Priyansh");
		System.out.println(e.getName());
		e.setSalary(9000);      // prints 
		e.setSalary(120000);
		e.raise(10);            // salary -> 132000
		e.raise(200);           // prints invalid

	}

}
