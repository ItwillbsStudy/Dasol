class Solution {
	/*
	 * a는 0, b는 1, c는 2, ..., j는 9입니다.
	 * 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
	 * 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return
	 * 
	 * */
    public String solution(int age) {
        String s = "";
        String str = "abcdefghij";
        String[] sarr = str.split("");  // 0에 a, 1에 b ... 저장된 String 배열
        while(age>0) {
        	s += sarr[age%10];	// 일의 자리에 대응되는 인덱스의 알파벳 저장
        	age /= 10;		// 10으로 나누어 십의 자리가 일의 자리로 오게,,
					// age가 0.XX 될때까지 반복	
        }
        
     // 일의자리부터 저장되었을테니 문자 뒤집어주기
        StringBuilder sb = new StringBuilder(s);
        String answer = sb.reverse().toString();
        
        return answer;
    }
}
