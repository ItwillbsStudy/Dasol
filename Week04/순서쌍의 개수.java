class Solution {
	/*
	 * 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return
	 * 
	 * 예시)
	 * n이 20 이므로 곱이 20인 순서쌍은
	 * (1, 20), (2, 10), (4, 5), (5, 4), (10, 2), (20, 1)
	 * 이므로 6을 return
	 * 
	 * */
    public int solution(int n) {	// N의 약수 개수 구하기
        int answer = 0;
        for(int i = 1; i <= n; i++) {	// i가 1부터 n까지 돌면서
		if(n%i == 0) {		// n을 i로 나눴을 때 나머지가 0이면 i가 n의 약수임
			answer++;	// 개수 카운트
		}
	}
        
        return answer;
    }
}
