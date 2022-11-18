import java.util.Scanner;

public class Main {
	
	static int x1 = 0 , x2 = 0;	// 출발점과 오르막길 끝점 0으로 초기화
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		 // N 입력
		int[] arr = new int[N];		 // 배열 입력
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
				int start = 0;
		int max = 0;
		
		for(int i = 1; i < arr.length; i++) { 		// while 조건문이 i-1부터라 시작을 1로 지정
			x1 = arr[start];						// 출발점 x1에 저장 (arr[0] 부터 시작)
			
			while(arr[i-1] < arr[i]) {				// 오르막이면(다음 index의 값이 크면)
				x2 = arr[i];						// x2에 값 저장하고
				i++;
				if(i == arr.length) break;			// 배열 크기 만큼 다 돌면 break로 빠져나옴
			}
			if(x2-x1 > 0 && x2-x1 > max) {			// 오르막이고 max보다 크면 max에 그 값을 저장
				max = x2-x1;						// TMI : 원래 arraylist에 높이 값 저장하고 다시 최댓값 구했는데
			}										//		 혜리 언니가 배열 없이 풀었다길래 듣고 배열 지우고
													//		 바로 max에 저장해서 max를 출력 하는 걸로 바꿨숨,,
			start=i;								// 오르막이 아니라면 아닌 지점을 다시 출발점으로 저장
		}	
		System.out.println(max);					// 결과 
		
		
	}
	
}
