package Week01;
// 중복된 숫자 개수
public class Duplicate {
    public int solution(int[] array, int n) {
        int answer = 0;
         for (int i = 0; i < array.length; i++) {
        	answer += (array[i] == n) ? 1 : 0;
        }
        return answer;
    }
    // 출력
 	public static void main(String[] args) {
 		int[] array = {1, 1, 2, 3, 4, 5};
 		Duplicate a = new Duplicate();
 			
 		System.out.println(a.solution(array, 1));
 	}
}
