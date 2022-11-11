package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class lotto_com {

	public static void main(String[] args)  {
		
		int[] temp = new int[6];
		int[] arr = new int[13];
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		int cnt = 0;
		int k = sc.nextInt();
		
		if(k == 0) break;
		else {
			
			for(int i = 0; i < k; i++) {
				arr[i] = sc.nextInt();	// 입력받은 
			}
		
			combination(arr, 6, temp, 0, 0);
			System.out.println();
			cnt++;
			}
		}	
		
		
		

	}
	
	// 조합
	// r: 뽑고자 하는 개수, temp: r개를 뽑는 결과값을 저장해 놓는 배열,
	// current: 현재 개수를 저장해 놓은 값, start: 그 다음 반복문 시작하는 값
	// ★★★★★★★★★★★★★★★★★★★★ 구글링해서 조합 메서드 긁어왔습니다..^^>>> ★★★★★★★★★★★★★★★★★★★★★★★★
	public static void combination(int[] arr, int r, int[] temp, int current, int start) {
		
		if(r==current) {
			for(int a : temp) {
				System.out.print(a + " ");
			}System.out.println();

			
		} else {
			for (int i = start; i < arr.length; i++) {
				if(arr[i] == 0) continue;	// 배열 크기가 13이라 0도 들어있어서 0 나오면 쓰루..
				temp[current] = arr[i];
				combination(arr, r, temp, current+1, i+1);
			}
		}
	}
	
}

/*
< 조합 경우의 수 >	: n!/ r!(n-r)!
조합은 기호 nCr로 나타내며
nCr = n-1Cr-1 + n-1Cr로 나타낼 수 있다.

즉 조합은 하나의 원소를 선택할 경우 + 하나의 원소를 선택하지 않을 경우 이 둘의 합을 나타낸다.

Ex) (1, 2, 3) 중에서 2개를 뽑는 조합이라고 생각해보면 -> 3C2
(1, X) - 1을 뽑는 경우(하나의 원소를 선택할 경우)				// n-1Cr-1
(X, X) - 1을 뽑지 않는 경우(하나의 원소를 선택하지 않는 경우) 	// n-1Cr
이처럼 2가지로 나뉠 수 있다.
*/
class Combination {

	public static int combination(int n, int r) {
		// 모두 뽑는 경우 || r개를 다 뽑은 경우
		if(n == r || r == 0) 	
			return 1; 
		else 
			// 하나의 원소를 선택할 경우 + 하나의 원소를 선택하지 않을 경우
			return combination(n - 1, r - 1) + combination(n - 1, r); 
	}
}
