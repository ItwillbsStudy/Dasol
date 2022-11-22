class Solution {
	/*
	 * 가위는 2 바위는 0 보는 5로 표현합니다.
	 * rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return
	 * 
	 * */
    public String solution(String rsp) {
        String[] rspArr = rsp.split(""); // 또 나왔다 split충 ㅎ
        								 // 숫자 받아서 배열에 저장
		String answer = "";
        // 배열 전부 돌면서 같은 문자 있으면 answer에 이기는 숫자 문자로 더해줌
		for(int i = 0; i < rsp.length(); i++) {
			answer += rspArr[i].equals("2") ? "0" :
				      rspArr[i].equals("5") ? "2" :
					  rspArr[i].equals("0") ? "5" : "";
		}
        
        
        return answer;
    }
}