package Week01;
// 머쓱이보다 키 큰 사람
public class Tall {
	public int solution(int[] array, int height) {
	        int answer = 0;
	        for(int a : array) {
	        	answer += (a > height) ? 1 : 0;
	    	}
	        return answer;
	    }
	// 출력
	public static void main(String[] args) {
		 Delicious a = new Delicious();
			
		 System.out.println(a.solution(64, 6));
	}
}
