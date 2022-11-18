class Solution {
	
	/*
	 *  문자열 my_string과 문자 letter이 매개변수로 주어집니다.
	 *  my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
	 *  
	 *  my_string	letter	result
	 *	"abcdef"	"f"		"abcde"
	 *
	 * */
	
    public String solution(String my_string, String letter) {
        String answer = "";
        
        // split() : 지정한 문자(letter)를 기준으로 문자열을 잘라 배열로 반환
        String[] str = my_string.split(letter);
        
        for(String s : str) {	// letter를 잘라낸 배열을 answer에 누적 저장
        	answer += s;
        }
        
        return answer;
    }
}