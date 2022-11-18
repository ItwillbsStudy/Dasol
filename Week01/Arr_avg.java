package Week01;
// 배열의 평균값
public class Arr_avg {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int num : numbers) {
        	answer += num;
        }
        answer /= numbers.length;

        return answer;
    }
    // 출력
    public static void main(String[] args) {
    	int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
    	Arr_avg a = new Arr_avg();
		
 		System.out.println(a.solution(numbers));
	}
}
