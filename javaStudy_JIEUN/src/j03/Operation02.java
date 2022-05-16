package j03;
/*
 * 논리 연산자
 * 
 * AND =>  && - 곱 
 * => 모든 조건이 참일 때 T의 결과를 가짐.
 * => 하나라도 거짓이면 false의 결과를 가짐.
 * 
 * OR  =>  || - 합
 * 
 * 
 * NOT =>  ! - 부정
 * !( 
 *
 * 
 * 0(false)
 * !0(true)
 * 
 * t(1) && t(1) => t(1)
 * t(1) && f(0=> t(0)
 * 
 * t(1) || 1) => t(1)
 * 
 * 
 * 
 */
public class Operation02 {
	public static void main(String[] args) {
	
		int num = 10;
	boolean result1 = num > 5;
	boolean result2 = num ==10;
	
	System.out.println("result1: " + result1);
	System.out.println("result2: " + result2);
	System.out.println("result1 AND result2: " + (result1 && result2));
	System.out.println("result1 NOT result2 :" + (result1 != result2));
	
	

}
}