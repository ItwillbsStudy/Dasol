import java.math.BigInteger;

/*
 * 서로 다른 n개 중 m개를 뽑는 경우의 수 공식은 다음과 같습니다. 
 * 
 * n! / ((n-m)! * m!)
 * 
 * 7개중 2개
 * 7 6 
 * 2 1 
 * Balls/2 > share
 * Share개 만큼 !
 * Share!
 *
 * 7개중 6개	=> 곱해야 할 수가 많으니 7개중 1개(Ball-Share) 뽑는 것과 같음
 * 7 6 5 4 3 2 1
 * 6 5 4 3 2 1 1
 *
 * Balls/2 < share
 * balls-share 개 만큼 7
 * balls-share!	  1
 * 
 * */
class Solution {
    static BigInteger top = new BigInteger("1");
	static BigInteger bottom = new BigInteger("1");
    
    public int solution(int balls, int share) {
        int answer = 0;
		answer = (balls/2 >= share) ?
				 com(balls, share).intValue() : com(balls, balls-share).intValue();
        										// balls/2보다 Share가 크면 Ball-Share개 뽑는 것으로 계산
        return answer;
		
	}
	
	public static BigInteger com(int balls, int share) {
	    if(share < 1) return top.divide(bottom);
	    else {
	        top = top.multiply(BigInteger.valueOf(balls));
	        bottom = bottom.multiply(BigInteger.valueOf(share));
	
	    return mul(balls-1, share-1);
	    }
    }
}


/*
static BigDecimal result = new BigDecimal("1");
static BigDecimal answer;
public static void main(String[] args) {
	int balls = 30;
	int share = 15;
	
	answer = 
			(balls/2 >= share) ?
			 result(balls, share) : result(balls, balls-share);
	
	System.out.println(answer);
	
}
// 순서 상관 없이 Ball부터 Ball-1씩 Share번 곱하고
// Share부터 Share번 나누려고 하니 실수형을 써야돼서 Bigdecimal 써봤지만 예외 남,,
 *
 * Exception in thread "main" java.lang.ArithmeticException:
 * Non-terminating decimal expansion; no exact representable decimal result.
 * 실수형을 쓸 때는 소수점 처리를 해주어야 함

public static BigDecimal result(int balls, int share) {
	
	if(share == 0) {
		return result;
		}
	
	// result *= balls;
	// result /= share;
	result = result.multiply(BigDecimal.valueOf(balls));
	result = result.divide(BigDecimal.valueOf(share), 100, RoundingMode.HALF_EVEN);
	
	return result(balls-1, share-1);
}
*/