package Week6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> card = new LinkedList<>();
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			card.offer(i);
		}
		
		while(card.size() > 1) {
			card.poll();				// 맨 위에 요소 삭제
			card.offer(card.poll());	// 그 다음 요소 아래로 넣기(새로 추가)
		}
		
		System.out.println(card.peek());
		
	}

}