package solution2;

public class Q3 {
	
	public int solution(int n) {
        int answer = 0;
        
        if(n % 2 == 0) {
        	for(int i = 1; i <= n; i++) {
        		if(i % 2 == 0) answer += (i * i);
        	}
        } else {
        	for(int i = 1; i <= n; i++) {
        		if(i % 2 != 0) answer += i;
        	}
        }
        
        // 밑에처럼 구현할 수도 있음
//        for(int i = n; i >= 0; i -= 2)
//            answer += (n % 2 == 0) ? i * i : i;
        
        return answer;
    }

}
