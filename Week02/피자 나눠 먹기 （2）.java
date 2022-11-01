class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        while(true) {
			if((n*i)%6 == 0) {
				answer = n*i;
				break;
			}
			i++;
		}

        return answer/6;
    }
}