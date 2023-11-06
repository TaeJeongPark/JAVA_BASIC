package chapter5;

public class Instanceof {

	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println("student instanceof Student : " + (student instanceof Student));
		System.out.println("student instanceof ComputerGrades : " + (student instanceof ComputerGrades));
		System.out.println("student instanceof MachineGrades : " + (student instanceof MachineGrades));
		
		ComputerGrades computerGrades = new ComputerGrades();
		System.out.println("computerGrades instanceof ComputerGrades : " + (computerGrades instanceof ComputerGrades));
		System.out.println("computerGrades instanceof Student : " + (computerGrades instanceof Student));
		
		Student student2 = new ComputerGrades();	// 업캐스팅
		System.out.println("student2 instanceof ComputerGrades : " + (student2 instanceof ComputerGrades));
		System.out.println("student2 instanceof Student : " + (student2 instanceof Student));
		System.out.println("student2 instanceof MachineGrades : " + (student2 instanceof MachineGrades));
		
		ComputerGrades computerGrades2 = (ComputerGrades) student2;	// 다운캐스팅
		System.out.println("computerGrades2 instanceof ComputerGrades : " + (computerGrades2 instanceof ComputerGrades));
		System.out.println("computerGrades2 instanceof Student : " + (computerGrades2 instanceof Student));
		
	}

}
