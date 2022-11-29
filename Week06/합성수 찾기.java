class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1, 2, 3은 합성수가 아니므로 4부터 시작
        for(int i = 4; i <= n; i++) {
		    for(int j = 2; j <= i/2; j++) {	// 약수는 쌍으로 존재하므로 i/2까지
				if(i%j == 0) {				// (1, n) 제외하고 약수가 1개이상 있으면		
					answer++;				// 합성수이므로 answer++ 해주고 break
					break;
				}
			}
		}
        return answer;
    }
}