package day4.StudentWithReadOnlyID;

public class Student {

	final int id;
	private String name;
	
	public Student(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	
	
}
