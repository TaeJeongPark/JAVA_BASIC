package chapter7;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("사과", "apple");
		dictionary.put("가위", "scissors");
		dictionary.put("결혼", "marriage");
		dictionary.put("사랑", "love");
		dictionary.put("욕심", "greed");
		dictionary.put("교수", "professor");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색할 단어를 입력하세요(exit 입력 시 종료) : ");
			String input = sc.next();
			
			if(input.equals("exit")) break;
			
			if(dictionary.containsKey(input)) {
				System.out.println(input + "은(는) 영어로 " + dictionary.get(input) + "입니다.");
			} else {
				System.out.println("입력하신 단어 " + input + "은(는) 사전에 등록되어 있지 않습니다.");
			}			
		}
		
		sc.close();
		
	}

}
