package day4.StudentWithReadOnlyID;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student(101);
		s.setName("Alice");
		System.out.println(s.getId() + " : " + s.getName());
//		s.id = 202;

	}

}
