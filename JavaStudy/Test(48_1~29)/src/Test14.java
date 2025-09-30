// Switch
// 연산을 위하여 두 개의 수와 실행하고자 하는 
// 연산을 입력 받아 연산을 완성하는 문제를 해결하시오. 

import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 수 입력: ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 수 입력: ");
		int num2 = sc.nextInt();
		
		System.out.println("""
=============
1. 덧셈
2. 뺄셈
3. 곱셈
4. 나눗셈
=============				""");
		
		System.out.println("메뉴 선택 :");
		String menu = sc.next();
		double result = 0;
		
		switch (menu){
			case "1":
				result = num1 + num2;
				break;
			case "2":
				result = num1 - num2;
				break;
			case "3":
				result = num1 * num2;
				break;
			case "4":
				result = num1 / num2;
				break;
			default: break;
		};
		
		System.out.println("결과 :" + result);
		sc.close();

	}
}
