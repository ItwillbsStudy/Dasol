import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        
		int[] d = new int[N+1];
		d[0] = 0;

		for(int i = 1; i < N+1; i++) {
			d[i] = -1;
			
			if( i >= 3 && d[i-3] != -1) {
				d[i] = d[i-3] + 1;
			}
			if(i >= 5 && d[i-5] != -1) {
				d[i] = d[i-5] + 1;
			}
			if(i >= 5 && d[i-3] != -1 && d[i-5] != -1) {
				d[i] = Math.min(d[i-5] + 1, d[i-3] + 1);
			}
			// d[3] = d[0] + 1;
			 
			
			
			
		}
		System.out.println(d[N]);

		
		
	}
}
