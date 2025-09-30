// Scanner객체의 nextInt() 이용해 숫자를 입력 받은 후 입력 받은 숫자에 
// 해당하는 코드를 가진 알파벳 문자로 바꾸어 출력하는 프로그램을 출력하시오. 
// 만약 변환된 데이터가 영문자가 아닌 경우 "알파벳에 해당하는 코드 값을 
// 입력하시오."라는 문자열을 출력한 후 프로그램을 종료한다.

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = scn.nextInt();
		
		char ch = (char) num;
		System.out.println(ch);
		
		scn.close();
	}
}
