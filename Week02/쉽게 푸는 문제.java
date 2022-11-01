import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[1000];

		int num = 1;
		int index = 0;
		
		LOOP:
		while(index < 1001) {
			
			for(int j = 0; j < num; j++) {
				if(index == 1000) break LOOP;
				arr[index] = num;
				index++;
			}
			num++;
		}
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int result = 0;
		
		for(int i = A; i <= B; i++) {
			result += arr[i-1];
		}
		
		System.out.println(result);
	}

}