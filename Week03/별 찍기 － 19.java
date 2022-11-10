package Week3;

import java.util.Scanner;

public class Star_19 {

	public static void main(String[] args) {
		/*
		 출력 1)	1						출력2)	2
		 *								*****	5 (3+2)
		 								*   *	
		 								* * *		
		 								*   *
		 								*****
		 				
		출력3)	  3		  				출력4)			4
		********* 9	(5+4)				*************	13 (7+6)
		*       * 						*           *
	2	* * * * *						* ********* *	
		* *   * *						* *       * *
		* * * * * 5						* * ***** * *
		* *   * * 						* * *   * * *
		* ***** * 						* * * * * * *	7
		*       * 						* * *   * * *
		********* 						* * ***** * *
										* *       * *
		 								* ********* *
		 								*           *
		 								*************
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 입력 받는 값
//		int n =9;
		int N = 4*n-3;	// 배열의 크기
		// (2*n-1)+2n
		
		String[][] arr = new String[N][N];
		
		// space로 초기화
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = " ";
			}
		}
		// 정중앙 별
		arr[N/2][N/2] = "*";
		// 나머지
		printArr(arr, N, 0);
		
		// 배열 출력
		for(String[] i : arr) {
			for(String j : i) {
				System.out.print(j);
			}System.out.println();
		}
		
	}
	
	//4,4		 //2,2		 //0,0
	// N=13, n=4  //N=9, n=3  //N=5, n=2  //N=1, N=1
	// N => 배열의 크기
	// cnt(테두리 개수 = 메서드 돌리는 횟수), N은 4씩 감소,
	// 시작점,끝점의 인덱스는 2씩 증가(=> cnt*2) 
	public static String[][] printArr(String[][] arr, int N, int cnt) {
		while(N > 1) {
			// 첫째 줄 & 마지막 줄
			for(int i = cnt; i < N+cnt; i++) {
				arr[cnt][i] = "*";
				arr[N-1+cnt][i]= "*";
			}
			
			// 둘째 ~ 마지막-1 줄 (index: 1~N-2)
			for(int i = cnt+1; i < (N-1)+cnt; i++) {
				arr[i][cnt] = "*";
				arr[i][N-1+cnt] = "*";
			}
			// N = 4n-3
			N -= 4;	
			cnt += 2;
			
			return printArr(arr, N, cnt);
		}	
			return arr;
			
			/*
			// 첫째 줄 & 마지막 줄
			for(int i = cnt*2; i < N+cnt*2; i++) {
				arr[cnt*2][i] = "*";
				arr[N-1+cnt*2][i]= "*";
			}
			
			// 둘째 ~ 마지막-1 줄 (index: 1~N-2)
			for(int i = cnt*2+1; i < (N-1)+cnt*2; i++) {
				arr[i][cnt*2] = "*";
				arr[i][N-1+cnt*2] = "*";
			}
			// N = 4n-3
			N -= 4;	
			cnt ++;
			*/
	}
	
	
}
