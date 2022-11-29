package Week05;

import java.util.*;

public class Tree_tra {
	// 전위 순회
	public static void preTra(char[][] arr, char root) {
		if(root == '.') return;
		else {
			System.out.print(root);
			preTra(arr, arr[root-'A'][0]);	
			preTra(arr, arr[root-'A'][1]);	
		}
	}
		
	public static void inTra(char[][] arr, char root) {
		if(root == '.') return;
		else {
			inTra(arr, arr[root-'A'][0]);	
			System.out.print(root);
			inTra(arr, arr[root-'A'][1]);	
		}	
	}	
		
	public static void postTra(char[][] arr, char root) {
		if(root == '.') return;
		else {
			postTra(arr, arr[root-'A'][0]);	
			postTra(arr, arr[root-'A'][1]);	
			System.out.print(root);
		}	
	}	
	
	public static void main(String[] args) {
		/*
		 * 전위 순회한 결과 : ABDCEFG // (루트) (왼쪽 자식) (오른쪽 자식)
		 * 중위 순회한 결과 : DBAECFG // (왼쪽 자식) (루트) (오른쪽 자식)
		 * 후위 순회한 결과 : DBEGFCA // (왼쪽 자식) (오른쪽 자식) (루트)
		 * 
		 * 입력)						출력)
		 * 7
		 * A B C					ABDCEFG
		 * B D .					DBAECFG
		 * C E F					DBEGFCA
		 * E . .
		 * F . G
		 * D . .
		 * G . .
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
		int N = 7;
		char[][] tree = new char[N][2];
		char root;	// 루트(부모)
		
		for(int i = 0; i < tree.length; i++) {
			root = sc.next().charAt(0);		// String을 char로 변환하기 위해 charAt() 사용
			tree[root-'A'][0] = sc.next().charAt(0);	// 왼쪽 자식
			tree[root-'A'][1] = sc.next().charAt(0);	// 오른쪽 자식
		}
		// 입력 받으면 알파벳 순서대로 부모 자식들 들어가게 됨
		// 0 <- A 	B C 
		// 1 <- B 	D . 		
		// 2 <- C 	E F	
		// 3 <- D 	. .
		// 4 <- E 	. .
		// 5 <- F	. G 
		// 6 <- G 	. .
			
		preTra(tree, 'A');	// 전위 순회 출력
		System.out.println();
		inTra(tree, 'A');
		System.out.println();
		postTra(tree, 'A');
	}

}