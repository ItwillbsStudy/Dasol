class Solution {
    public int[] solution(int n) {
        int index = 0;
		int arrsize = 0;
        
        arrsize = (n%2 > 0) ? (n/2)+1 : n/2;
        int[] answer = new int[arrsize];
        for(int i = 0; i <= n; i++) {
			if(i%2>0) {
				answer[index] = i;
				index++;
			}
		}
        
        return answer;
    }
}