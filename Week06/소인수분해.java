import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
		List<Integer> arr = new ArrayList<>();
		
		for(int i = 2; i <= n; i++) {	// 1은 소수가 아니므로 2부터
			if(isPrime(i) && (n % i == 0)) {	// i가 소수고 i로 나누어 떨어진다면
				while(n % i != 0) {	// 나누어지지 않을 때까지 나눔
					n/=2;
				}
			arr.add(i);	// 나누어진 소수를 list에 저장
			}
		}
	       return arr.stream().mapToInt(i -> i).toArray();	// 리스트 출력
	       // 리스트를 스트림으로 변환 후, map을 이용해서 intStream을 가져오고 (Integer -> int(primitive))
		// 그 후에 toArray()를 통해 배열로 만드는 방법이다.
		// i -> i 는 값을 변형 없이 그대로 사용한다는 걸 의미하는 것 같음,,^^..
	    
		/*
		< list를 int[]로 변환 >
		Stream :
		일반적인 Stream 객체를 원시 Stream으로 바꾸거나
		그 반대로 하는 작업이 필요한 경우 사용하며 복잡한 반복문, 조건문 등을 함수를 이용하여 한 줄에 쓸 수 있게 해줌..
		*/	
		
	}
    // 소수인지 판별하는 메서드
	public static boolean isPrime(int n) {
		int cnt = 0;
		for(int i = 2; i <= n; i++) {
			if(n%i==0) 		cnt++;
			if(cnt > 1)		break;
		}
		 
		if(cnt == 1)	return true;	// 1을 제외한 자기자신만 있으면 cnt는 1이므로 소수 => true
		else  			return false;	// 그 이상이면 소수가 아니므로 => false
	 }


}
