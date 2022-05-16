package j03;

public class Operation03 {

	public static void main(String[] args) {
		
	/* 
	 * year = 1999
	 * result = f
	 * 년도가 4의 배수이면 T 아니면 F
	 
		
	int year = 2000;
	boolean result= 1999 % 4==0;
		
	System.out.println(result);
	*/
		
		/* 
		 * 윤년이면 T 아니면 F
		 * 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수 일때 
		 */
		 
		int year = 1999;
		boolean result = (year %4==0) && (year % 100 !=0) || (year % 400 ==0);
		
		System.out.println(result);
		
		
		

	}

}
