package chapter5;

public class AbstractSub2 extends AbstractSuper {

	@Override
	public String getReg() {
		return reg.substring(0, 4) + "년 " + reg.substring(4, 6)
		+ "월 " + reg.substring(6) + "일";
	}
	
}
