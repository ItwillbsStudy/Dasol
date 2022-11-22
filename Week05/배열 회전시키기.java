class Solution {
	
    public int[] solution(int[] numbers, String direction) {
		int n = numbers.length;
		int[] arr = new int[n*2];	// numbers배열 두배로 저장할 배열
		int[] answer = new int[n];
		// 배열 두배 만들기
		for(int i = 0; i < n; i++) {
				arr[i] = numbers[i];
				arr[i+n] = numbers[i];
		}
		/* i: 0  1  2  3 4 5
		 *   [1, 2, 3] 1 2 3			"right"		[3, 1, 2]
		 * 								"left"      [2, 3, 1]
		 * */
		int dir = (direction.equals("right")) ? n-1 : 1;
        // 방향 변수 받아서 오른쪽으로 돌땐 i + n-1부터 시작
		// 왼쪽은 i + 1 부터 시작
		for(int i = 0; i < n; i++) {
			answer[i] = arr[i+dir];
		}
        return answer;
    }
}