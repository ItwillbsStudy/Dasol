class Solution {
	/*
	 * 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return
	 * 
	 * 예시)
	 * emergency	result
	 * [3, 76, 24]	[3, 1, 2]
	 * 
	 * */
    public int[] solution(int[] emergency) {
    	// emergency 배열과 출력 배열 크기가 같으므로 같은 크기로 배열을 만듦
        int[] answer = new int[emergency.length];
        
        // 응급 순서가 1부터 시작하므로 answer 배열에 일단 1로 초기화
        for(int i = 0; i < emergency.length; i++) {
			answer[i] = 1;
		}
		
        // 인덱스 0부터 다른 요소들의 크기를 모두 비교
		for(int i = 0; i < emergency.length; i++) {
			for(int j = 0; j < emergency.length; j++) {	
				if(emergency[i] < emergency[j]) { // 자신이 다른 값보다 작으면 응급도가 낮으므로 +1 해줌
					answer[i]++;
				}
			}
		}
        
        return answer;
    }
}