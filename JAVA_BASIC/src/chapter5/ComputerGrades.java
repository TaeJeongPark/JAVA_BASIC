package chapter5;

public class ComputerGrades extends Student {

	String java;		// 자바 성적
	String c;			// C 성적
	String database;	// 데이터베이스 성적
	String android;		// 안드로이드 성적
	
	public void setComputerGrades(String java, String c, String database, String android) {
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
	
	// 오버라이딩 연습
	public String transformBirth() {
		String str = birth + "";
		return str.substring(0, 4) + "년 " + str.substring(4, 6) + "월 " + str.substring(6) + "일";
	}
	
}
