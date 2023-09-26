package solution2;

public class Q6 {

	public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for(int i = 0; answer <= n; i++) {
            answer += numbers[i];
        }
        
        return answer;
    }
	
}
