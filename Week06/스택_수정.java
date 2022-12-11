package Week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 스택 {
	// Scanner 썼을 때 계속 시간초과 났는데 버퍼로 바꾸니까 제출 됐음...

	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int result = 0;
		int n = Integer.parseInt(br.readLine()); //Int
		for(int i = 0; i < n; i++) {
//			String input = sc.next();
			// next() 메소드는 스페이스 즉 공백 전까지 입력받은 문자열을 리턴
			// nextLine()메소드는 Enter를 치기 전까지(줄바꿈 전 까지) 쓴 문자열을 모두 리턴
			// 공백이 있는 문자열 한줄을 리턴받고 싶으면 nextLine() 메소드를 사용, 한단어를 받고싶다면 next() 사용
			// readLine()도 nextLint()과 같음
			// read()는 괄호 안에 출력할 byte를 지정해 주면 지정해 준 byte만큼 출력, 지정해 주지 않았다면 입력이 모두 끝날 때까지 읽어들임.
			String input = br.readLine(); //String
			if(input.contains("push")) {
				int X = Integer.parseInt(input.substring(5));
				stack.push(X);
				continue;
			} 
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
			bw.write(String.valueOf(result) + "\n");
			
			
		}
		
		bw.flush();	// 버퍼에 들어있는 것을 비워주는 함수..
		bw.close();
		br.close();
	}

}
