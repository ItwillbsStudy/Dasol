import java.util.Arrays;

class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
						  ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
						  "...","-","..-","...-",".--","-..-","-.--","--.."};
        String answer = "";
		String[] result = letter.split(" ");	// 입력받은 letter를 공백 기준으로 잘라서 String배열에 저장
		// a = 97 (아스키코드)
		for(int i = 0; i <  result.length; i++) {
			// indexOf : 특정 값의 인덱스 알려줌
			// indexOf는 list에서 사용 가능하므로 morse 배열을 arraylist로 바꿔줌
			answer += (char)(Arrays.asList(morse).indexOf(result[i]) + 97);
        }
        return answer;
    }
}