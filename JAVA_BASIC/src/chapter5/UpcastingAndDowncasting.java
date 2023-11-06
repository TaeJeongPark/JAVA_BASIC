package chapter5;

public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		
		Student student = new ComputerGrades();	// 업캐스팅
		student.name = "홍길동";
//		student.java = "A+";
		
		ComputerGrades computerGrades = (ComputerGrades) student;	// 다운캐스팅
		computerGrades.java = "A+";
		computerGrades.name = "홍길동";
		
	}

}
