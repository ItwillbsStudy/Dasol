class Solution {
	/*
	 * x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
 	 * x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
 	 * x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
 	 * x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
 	 * 
	 * */
    public int solution(int[] dot) {
        int answer = 0;
		boolean bool = (dot[1] > 0);	
        
		if(dot[0] > 0) {	// X좌표가 양수면
			answer = bool ? 1 : 4; 		// y좌표가 양수면 1, 음수면 4
		} else {			// x좌표가 음수면
			answer = bool ? 2 : 3;		// y좌표가 양수면 2, 음수면 3
		} 
        return answer;
    }
}