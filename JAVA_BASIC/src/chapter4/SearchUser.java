package chapter4;

public class SearchUser {
	
	String num;
	static int id = 1;
	
	
	public SearchUser() {}
	
	SearchUser(String num) {
		this(num, 12);
	}
	
	SearchUser(int id) {
		this.num = "";
		this.id = id;
	}
	
	SearchUser(String num, int id) {
		this.num = num;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

}
