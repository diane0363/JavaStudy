//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;
package java.day1;

import java.util.Scanner;  // ctrl + shift + o


public class CalcBMI {
	public static void main(String[] args) {
		// 키, 몸무게, bmi 계산식 = 몸무게(kg) / 키(m)의 제곱 
		
		// String은 참조자료형(값이 아닌 객체의 주소-참조값-가 저장된다) 이지만 
		String name = "홍길동"; // 기본자료형처럼 선언하고 초기화 가능 (String만!!) 
		// => 참조 자료형이어서 초기화를 하지 않아도 된다. (초기화X -> 자동으로 null 초기화)
		
//		double height = 175.8;  // cm
//		int weight = 68;        // kg
		
//		height / 100; // double / int -> promotion이 일어난다. (큰 타입(=최대값이 큰 값)으로 변경 double > int)
		// 자바에서 식은 문장이 아님. 무조건 변수에 저장을 해주어야 한다.
//		double bmi;             // 변수 선언, 초기화 X 
		
//		height = height / 100; 
//		
//		bmi = weight / ( height * height ); // ^ 연산자 없음
//		
//		System.out.println(bmi);
//		
//		System.out.printf("키가 %.2fcm이고, 몸무게가 %dKg인 사람은 BMI가 %.2f입니다.", height, weight, bmi);   // printf의 첫번째 전달 인자는 무조건 string 


		
		
		
		Scanner keyin = new Scanner(System.in); //System.in을 쓸 때 Scanner 타입의 변수 선언, new Scanner 
		// 처음 선언을 할 때 new 키워드를 가지고 객체를 생성하는 것이 기본이다.
		// 클래스 함수는 무조건 대문자로 시작. 파이썬에도 new 가 있지만 생략하는 것 
//		System.in // 자바의 키보드 객체 
		
		double height;
		int weight;
		double bmi;
		
		// 키보드로부터 데이터 입력 
		System.out.println("키 입력: ");
		height = keyin.nextDouble();
		System.out.println("몸무게 입력: ");
		weight = keyin.nextInt();
		
		height = height / 100; 
		
		bmi = weight / ( height * height ); // ^ 연산자 없음
				
		System.out.printf("키가 %.2fcm이고, 몸무게가 %dKg인 사람은 BMI가 %.2f입니다.", height, weight, bmi);   // 첫번째 전달 인자는 무조건 string 

		keyin.close();
		
	}

}
