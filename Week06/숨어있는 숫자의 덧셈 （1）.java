class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split(""); 
        // 숫자 아스키코드 : 48~57
		for(int i = 0; i < strArr.length; i++) {
			char ch = strArr[i].charAt(0);	// String을 char로 변환
			if(ch > 57) continue;	// 문자가 나오면 넘어감
			answer += (ch-48);		// 숫자 저장
		}
        return answer;
    }
    
}