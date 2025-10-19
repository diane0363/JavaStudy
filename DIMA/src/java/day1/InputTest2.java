/*
 * 입력 함수 : nextInt(), nextDouble(), next(), nextLine() 
 * nextInt()와 nextDouble()은 내부적으로 파싱 작업을 한다. -> 파싱가능한 데이터만(white space 불가)
 * 
 * next() 는 white space전까지만 데이터를 들고온다. 
 * White Space: 탭, 스페이스, 엔터 (입력 버퍼 내의 데이터를 변수로 이동)
 * nextLIne()은 white space를 포함해 데이터를 들고온다. 
 * 
 * 문자열 입력받는 메소드 (next(), nextLine())를 사용하여 
 * 입력 버퍼에 대해 익혀봅시다. (범퍼와 비슷한 개념, 입력 완충을 위한 메모리 공간이 일시적으로 생김) 
 * 
 * 
 * (문제!) 
 * next() 와 nextLine()의 차이는? 
 * println()과 printf()의 차이는? 
 */
package java.day1;

import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
		// 지역변수 keyin은 {} 가 닫히는 순간 메모리에서 정리가 된다.
		Scanner keyin = new Scanner(System.in);
	
		int kor, eng, mat, total;
		double avg;
		
		System.out.println("국어, 영어, 수학 점수를 연달아 입력: ");
		
		// nextInt(), nextdouble(), next() 파싱가능한 데이터만 차례대로 하나씩 가져온다. whitespace에서 멈추고 다음으로 넘어감.
		// 즉 파싱가능한 데이터 3개를 모두 입력해야 결과 출력
		// nextLine()의 경우 버퍼를 비울 수도, white space를 가져올 수도 있다.
		
		kor = keyin.nextInt();   
		eng = keyin.nextInt();
		mat = keyin.nextInt();
		
		total = kor + eng + mat; 
//		avg = total / 3; // int / int 로 계산하면 int타입이 나온다. 하지만 avg는 double 타입 
		avg = total / 3.0; 
//		keyin = 
		System.out.println(total + "," + avg);
		
		// 프로모션 : 묵시적 형변환 (더 큰 타입으로 자동 변환)
		// 캐스팅 : 명시적 형변환
		// this 는 파이썬의 self
		// 배열 = 리스트
		// 인터페이스 중요
		// array list = Collection 프레임워크 = 파이썬의 딕셔너리
		// 람다식 - 함수를 값으로 사용
		// 스레드 - 동시처리 (온라인 챗봇에서 필수) - 사실상 동시 X, 그만큼 빨리 사용하는 것 (코어수 만큼 가능)
		// 소켓 스레드
		
		
	}

}
