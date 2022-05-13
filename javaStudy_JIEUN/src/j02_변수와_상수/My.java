package j02_변수와_상수;

public class My {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 메모,필기
 *1.
 *name1, name2, name3
 *age
 *phone(연락처) 
 *address(주소)
 *
 *이름: 박지은
 *나이:
 *연락처:
 *주소:
 *

*/
		
	char name1 = '박';
	char name2 ='지';
	char name3 ='은';
	int age = 20;
	String address = "울산 남구";
	String phone="010-3266-7823";
	 
	System.out.println("이름: "+ name1 +name2 + name3 );
	//System.out.println("" + name1+ name2 + name3); ""랑 더해지면 문자열 만들어짐
	System.out.println("나이: "+ age);
	System.out.println("연락처: " + phone);
	System.out.print("주소: "+ address);

	System.out.println("세 수의 합: "+(10+20+30));
	
	
	
	
	}

}
