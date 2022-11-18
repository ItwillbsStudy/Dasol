class Solution {
	/*
	 * 각 angle이 매개변수로 주어질 때 
	 * 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return
	 *
	 * 예각 : 0 < angle < 90
	 * 직각 : angle = 90
	 * 둔각 : 90 < angle < 180
	 * 평각 : angle = 180
	 * 
	 * */
	
    public int solution(int angle) {
        int answer = 0;

        	answer += (angle < 90)   ? 1 :
        	          (angle == 180) ? 4 :
        	          (angle == 90)  ? 2 : 3;
			
        return answer;
        
    }
}