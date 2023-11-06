package chapter5;

public class MachineGrades extends Student {

	String electron;		// 전자공학 성적
	
	public void setComputerGrades(String electron) {
		this.electron = electron;
	}
	
	public void printComputerGrades() {
		super.printStudent();
		System.out.println("electron : " + electron);
	}
	
}
