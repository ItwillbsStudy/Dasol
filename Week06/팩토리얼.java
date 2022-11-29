class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; n/i >= 1; i++) { // n을 i로 나눴을 때 1보다 크거나 같을 때까지만 계산
			n /= i;						// ex) n = 5 일 때 i = 2, n = 2이고 3으로 나눌 수 없으니 멈춰야함.
			answer = i;
		}
	
        return answer;
	}
}