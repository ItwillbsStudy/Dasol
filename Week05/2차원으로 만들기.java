class Solution {
	/*
	 * 2차원 배열로 만들기
	 * */
    public int[][] solution(int[] num_list, int n) {
    	// 행 개수 : num_list 배열 길이 / n 
    	// 열 개수 : n  
    	int[][] answer = new int[num_list.length/n][n];	
		int index = 0;
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < answer[i].length; j++) {
				answer[i][j] = num_list[index++];
			}
		}
        return answer;
    }
}