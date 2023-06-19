package student;

// Atributos da classe estudante
public class Student {
	private int studentId;
	private String name;
	private String cpf;
	private double gpa;
	
	// construtor: é o primeiro a ser executado quando criamos um objeto estudante
	public Student(int studentId, String name, String cpf) {
		this.studentId = studentId;
		this.name = name;
		this.cpf = cpf;
	}
	//Metodo Getters And Setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", cpf=" + cpf + ", gpa=" + gpa + "]";
	}
	
	
}
