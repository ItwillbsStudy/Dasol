package Week01;
// 최댓값 만들기
public class Max {
	public int solution(int[] numbers) {
        int max = getMax(numbers);
	    
	    for(int i= 0 ; i < numbers.length; i++) {
	    	if(numbers[i] < max) {
	    		numbers[i] *= max;
	    	}
	    }
	   
        return max = getMax(numbers);
    }
    // 최댓값 구하는 메서드
    static int getMax(int[] arr) {
		int max = 0; 
		for(int num : arr) {
		    	max = num > max ? num : max;
		    }
		return max;
	}
    
    // 출력
    public static void main(String[] args) {
    	int[] numbers = {0, 31, 24, 10, 1, 9};
    	Max a = new Max();
		
		System.out.println(a.solution(numbers));
	}
} 
