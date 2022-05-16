package j03;

public class Operation07 {

	public static void main(String[] args) {
	
		/*
		 * 4배수 && 100배수가 아님  || 400배수
		 * 참이면 윤년
		 * 거짓이면 윤년이 아님
		 */
		
		int year = 2000;
		
	String result = year % 4==0 
			&& year %100 !=0 
			|| year % 400 ==0? "윤년" :"윤년이 아님";

	boolean result1 = year % 4==0 
			&& year %100 !=0 
			|| year % 400 ==0? true : false;
	
		System.out.println("결과 : " + result);
		System.out.println("결과 : " + result1);

	}

}
