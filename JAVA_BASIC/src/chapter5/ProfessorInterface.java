package chapter5;

interface ProfessorInterface {

	void getName();
	void getCode();
	default void getCompany() {
		System.out.println("인하공업전문대학");
	}
	
}
