package solution2;

public class Q4 {
	
	public int solution(String ineq, String eq, int n, int m) {
        
		int answer = 0;
		
		if(ineq.equals("<")) {
			if(eq.equals("=")) {
				answer = n <= m ? 1 : 0;
			} else {
				answer = n < m ? 1 : 0;
			}
		} else {
			if(eq.equals("=")) {
				answer = n >= m ? 1 : 0;
			} else {
				answer = n > m ? 1 : 0;
			}
		}
		
		return answer;
		
    }

}