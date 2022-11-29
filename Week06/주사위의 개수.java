class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        // 가로세로높이 모두 n으로 나눈 것을 곱함
        for(int i = 0; i < box.length; i++) {
		    	answer *= box[i] / n;
		    }
        
        return answer;
    }
}