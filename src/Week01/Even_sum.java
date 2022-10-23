package Week01;
// 짝수의 합
public class Even_sum {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n ; i++) {
        	answer += (i%2==0) ? i : 0;
		}
        return answer;
    }
    // 출력
    public static void main(String[] args) {
    	Even_sum a = new Even_sum();
		
 		System.out.println(a.solution(10));
	}
}
