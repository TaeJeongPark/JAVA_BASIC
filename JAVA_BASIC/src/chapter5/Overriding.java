package chapter5;

public class Overriding {

	public static void main(String[] args) {
		
		ComputerGrades computerGrades = new ComputerGrades();
		computerGrades.birth = 20040101;
		System.out.println(computerGrades.transformBirth());
		
		Student student = new ComputerGrades();	// 업캐스팅
		student.birth = 20040101;
		System.out.println(student.transformBirth());
		
		Student student2 = new Student();
		student2.birth = 20040101;
		System.out.println(student2.transformBirth());
		
	}

}
