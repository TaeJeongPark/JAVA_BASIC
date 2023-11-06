package chapter5;

public class SuperStudent {

	String name;		// 이름
	int birth;			// 생년월일
	int sNum;			// 학번
	String department;	// 학과
	int grade;			// 학년
	
	public SuperStudent(String name, int birth, int sNum, String department, int grade) {
		this.name = name;
		this.birth = birth;
		this.sNum = sNum;
		this.department = department;
		this.grade = grade;
	}
	
	public void printStudent() {
		System.out.println("이름 : " + name);
		System.out.println("생년월일 : " + birth);
		System.out.println("학번 : " + sNum);
		System.out.println("학과 : " + department);
		System.out.println("학년 : " + grade);
	}
	
}
