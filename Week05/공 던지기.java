class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1; // k가 1일 땐 1번 이므로 초기값 1
        // 2씩 k-1번 더해짐
		for(int i = 0; i < k-1; i++) {
			if(answer >= numbers.length) {	// 인원수 넘었을 땐
				answer -= numbers.length;	// 다시 처음으로 돌아가야하니까 인원수만큼 빼주기
			}
			answer += 2;
		}
        return answer;
    }
}