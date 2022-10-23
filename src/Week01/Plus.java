package Week01;
// 자릿수 더하기
class Solution {
	public int solution(int n) {
		int answer = 0;
		for(; n > 0; n /= 10) {
			 answer += (n%10);
		}
	    return answer;
	}
}

public class Plus {
	// 출력
	public static void main(String[] args) {
		Solution a = new Solution();
		
		System.out.println(a.solution(930211));
	}
}