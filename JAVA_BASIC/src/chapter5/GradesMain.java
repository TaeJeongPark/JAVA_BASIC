package chapter5;

public class GradesMain {

	public static void main(String[] args) {
		
		ComputerGrades cg = new ComputerGrades();
		cg.name = "홍길동";
		cg.birth = 20040101;
		cg.sNum = 202345011;
		cg.department = "컴퓨터시스템과";
		cg.grade = 1;
		cg.java = "A+";
		cg.c = "B+";
		cg.database = "A0";
		cg.android = "C+";
		
		cg.printComputerGrades();
		
	}

}
