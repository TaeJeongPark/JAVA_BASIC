package chapter4;

public class Main {

	public static void main(String[] args) {
		
		InMoney inMoney = new InMoney(2);
		SearchUser searchUser = new SearchUser("서정");
		System.out.println(inMoney.getId());
		System.out.println(searchUser.getId());
		
	}

}
