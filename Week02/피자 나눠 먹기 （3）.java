class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        while(true) {
			n -= slice;
			answer++;
			if(n <= 0) {
				break;
			}
		}
        return answer;
    }
}