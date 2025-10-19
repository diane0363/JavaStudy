/* 정수를 입력받아 양수, 음수 판별하기
 * 
 * 값 입력 : -3
 * 
 * -3은 음수입니다.
 * 
 */
package java.day1;

import java.util.Scanner;

public class OperateTest3 {

	public static void main(String[] args) {
		// (삼항 연산자) : (조건식) ? 수식1 : 수식2  -> 조건식 일치하면 수식1 반환 아니면 수식2 반환
		Scanner keyin = new Scanner(System.in);
		
		int value;
		String result;
		
		// 입력 
		System.out.print("값 입력 : ");
		value = keyin.nextInt();
		
//		result = (value > 0) ? "양수" : "음수" ; // value가 0일 때 음수가 뜬다.
		result = (value > 0) ? "양수" : (value < 0 ) ? "음수" : "0" ; 
		
		System.out.printf("%d은 %s입니다.%n", value, result);
	}
	

}
