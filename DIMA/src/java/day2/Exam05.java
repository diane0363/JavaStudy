/*
 * -- up and down 프로그램 작성하기
 * 1 ~ 100 사이의 난수를 1개 발생시켜 
 * 
 * < 실행 예 > 
 * 값을 입력 : 50
 * UP!
 * 
 * 값을 입력 : 75
 * DOWN!
 * 
 * (5번만에 맞췄을 때)
 * 값을 입력 : 60
 * 오 !! 천재시군요! 
 * 
 * (실패했을 때)
 * 값을 입력 : 30
 * 땡 ! 
 * 
 */
package java.day2;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		// 내 풀이
//		Scanner key = new Scanner(System.in);
//		int num1, num2;
//
//		num1 = (int)((Math.random()) * 99 + 1);
//
//		for(int i = 0; i < 5; ++i) {
//			System.out.println("값을 입력: ");
//			num2 = key.nextInt();
//			if(num1 > num2) System.out.println("UP!");
//			else if (num1 < num2) System.out.println("DOWN!");
//			else if (num1 == num2) System.out.println("오! 천재시군요!");
//			
//		}
//		System.out.println("땡!");
//		key.close()

	// 교수님 풀이 
		int value = (int)(Math.random() * 100) + 1 ;
		int input;
		Scanner keyin = new Scanner(System.in);
	
//		System.out.println("정답: " + value);  // 테스트용 
	
		for(int i = 0 ; i < 5; ++i ) {  // ++i ( == i+=1 )
			System.out.println("맞춰보시오");
			input = keyin.nextInt();
			
			if (value < input) System.out.println("Down!!");
			else if (value > input) System.out.println("UP!!");
			else {
				System.out.println("오~ 맞췄군요!!");
				System.exit(0);  // return; 정수 0은 운영체제에 전달되는 값. 프로그램 종료 이유 전달. (0 : 정상적인 프로그램 종료) 
				
			}
		}
		
		System.out.println("이것도 못 맞추냐?!?!");
		System.out.println("정답은: " + value);
		
		keyin.close();
	}
}





