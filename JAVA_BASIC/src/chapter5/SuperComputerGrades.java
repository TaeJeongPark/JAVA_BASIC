package chapter5;

public class SuperComputerGrades extends SuperStudent {

	String java;		// 자바 성적
	String c;			// C 성적
	String database;	// 데이터베이스 성적
	String android;		// 안드로이드 성적
	
	public SuperComputerGrades(String name, int birth, int sNum, String department, int grade, String java, String c, String database, String android) {
		super(name, birth, sNum, department, grade);
		this.java = java;
		this.c = c;
		this.database = database;
		this.android = android;
	}
	
	public void printComputerGrades() {
		super.printStudent();
		System.out.println("java : " + java);
		System.out.println("c : " + c);
		System.out.println("database : " + database);
		System.out.println("android : " + android);
	}
	
}
