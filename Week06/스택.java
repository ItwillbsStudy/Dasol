package Week6;

import java.util.Scanner;
import java.util.Stack;

public class 스택 {
	// 답은 나옴
	// 제출은 안됨 (시간 초과...)
	// 근데 암튼 답 나옴
	// 저는 여기까지입니다..
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int n = sc.nextInt();
		for(int i = 0; i < n+1; i++) {
			// next() 메소드는 스페이스 즉 공백 전까지 입력받은 문자열을 리턴
//			String input = sc.next();
			// nextLine()메소드는 Enter를 치기 전까지 쓴 문자열을 모두 리턴
			// 공백이 있는 문자열 한줄을 리턴받고 싶으면 nextLine() 메소드를 사용, 한단어를 받고싶다면 next() 사용
			String input = sc.nextLine();
			if(input.contains("push")) {
				int X = Integer.parseInt(input.substring(5));
				stack.push(X);
			} else if(i>0) {
				switch (input) {
				case "pop":
					result = (stack.isEmpty()) ? -1 : stack.pop();
					break;
				case "size":
					result = stack.size();
					break;
				case "empty":
					result = (stack.isEmpty()) ? 1 : 0;
					break;
				case "top":
					result = (stack.isEmpty()) ? -1 : stack.peek();
					break;
				}
				System.out.println(result);
			}
			
		}
		sc.close();
}
//	public static void pop() {
//		if(stack.isEmpty()) System.out.println(-1);
//		else				System.out.println(stack.pop());
//	}
//	
//	public static void empty() {
//		if(stack.isEmpty()) System.out.println(1);
//		else				System.out.println(0);
//	}
//	
//	public static void top() {
//		if(stack.isEmpty()) System.out.println(-1);
//		else				System.out.println(stack.peek());
//	}
}
