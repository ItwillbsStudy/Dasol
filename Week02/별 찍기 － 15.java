import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		int star = 1;
		int space1 = line-star;
		int space2 = 0;
		
		for(int i = 1; i <= line; i++) {
			printstr(space1, " ");	// 공백
			printstr(star, "*");	// 왼쪽별찍기
			printstr(space2, " ");	// 중간공백
			if(i > 1) {
				printstr(star, "*");	// 오른쪽 별찍기
				space2++;
			}
			System.out.println();
			space1--;
			space2++;
		}
	}
	
	public static void printstr(int count, String str) {
		for(int i = 1; i <= count; i++) {
			System.out.print(str);
		}
		
	}
	
}