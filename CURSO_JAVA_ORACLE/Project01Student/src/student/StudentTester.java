package student;

public class StudentTester {

	public static void main(String[] args) {
		Student st1 = new Student(1,"Juninho","xxxxxx");
		System.out.println(st1.toString());
		
		Student st2 = new Student(2,"Zezinho","xxxxxx");
		System.out.println(st2.toString());
		
		st1.setName("Junior");
		System.out.println(st1.toString());

	}

}
