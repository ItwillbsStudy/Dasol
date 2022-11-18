package Week01;
// 편지
public class Mail {
	public int solution(String message) {
		int answer = message.length() * 2;
	    // message.length() : 문자열 길이 리턴 
	    return answer;
	}
		// 출력
	public static void main(String[] args) {
		Mail a = new Mail();
			
		System.out.println(a.solution("happy birthday!"));
		}
}
