import java.util.ArrayList;
	/*
	 * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
	 * numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return
	 * 
	 * numbers	  		 num1  num2	  result
	 * [1, 2, 3, 4, 5]	 1	   3	  [2, 3, 4]
	 * 
	 * */

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
    	int size = num2-num1+1;			// 배열의 크기
    	int[] answer = new int[size];
    	int index = 0;
    	
    	for(int i = num1; i <= num2; i++) {	// num1부터 num2까지
    		answer[index] = numbers[i];		// answer배열 0부터 차례대로 저장
    		index++;						
        }
    	
        return answer;
    }
}