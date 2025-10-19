/*
 * 문제 6 , 시간환산
 * 키보드로부터 정수 값에 해당하는 초 단위의 값을 입력받아 시, 분, 초 단위로 환산해 출력 프로그램 작성 
 * 
 * 실행 결과
 * 시간을 초 단위로 입력하세요 : 
 * 2354초는 0시간 39분 14초입니다.
 * 
 */
package java.day1;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
		int time; 
//		String time;
		int hour, minute, seconds;
		
//		System.out.print('시간을 초 단위로 입력하세요 : ');  // 홑따옴표 에러 
		System.out.print("시간을 초 단위로 입력하세요 : ");
		
		time = keyin.nextInt();
		hour = time / 3600 ;
		minute = time / 60;
		seconds = time % 60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초입니다.", time, hour, minute, seconds);
				
		
		
	}

}

