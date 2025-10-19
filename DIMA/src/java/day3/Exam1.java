/*
 * 배열을 이용한 예약 프로그램 작성
 * 
 * 좌석이 10개 있는 소극장에 예약을 받는 시스템을 작성하려고 합니다.
 * 예약자의 이름과 좌석 1~10을 입력 받아 전체 출력하는 프로그램을 작성하세요. (1회만 입력가능) 
 * 
 * [실행 결과]
 * ===========================
 * [] [] [] [] [] [] [] [] ..
 * 예약자 이름 입력 : James
 * 좌석 입력 (1 ~ 10) : 5
 * ===========================
 * [] [] [] [] [James] [] ...
 */
package java.day3;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
//		// 0번 방이 null인지 체크, next로 입력 받기(왜?), 예약이 다 찰 때까지 반복 
//		Scanner key = new Scanner(System.in);
//		String name;
//		int num;
//
//		String[] seat = new String[10];
//
//		for while() {
//		System.out.println("예약자 이름입력 : ");
//		name = key.next();
//		System.out.println("좌석 입력 (1 ~ 10) : ");
//		num = key.next();
//		
//		if(seat[num-1] != null) {
//			seat[num-1] = name;
//		}
//			
//		
//		}		
		
		// 교수님 풀이 
		Scanner scanner = new Scanner(System.in);
		String[] seat = new String[10];
		int no;         
		String name;    

		// 자리를 예약 받기 위한 for문 
		for(int j=0; j < seat.length; ++j ) {
			// 1) 현재 예약 상황 출력
			System.out.println("=====================================================");
			for(int i=0; i<seat.length; ++i) {
			
				System.out.print("[ ");
				
				String temp = (seat[i] == null) ? " " : seat[i]; 
				
				System.out.print(temp);
				System.out.print(" ]");
			}
			System.out.println();  // 줄바꿈을 위한 것 
		
			// 2) 예약 받기
			System.out.println("이름: ");
			name = scanner.next();
			
			System.out.println("번호(1~10): ");
			no = scanner.nextInt();
			
			// 1~10 범위를 벗어나면 다시 입력받을 수 있어야 한다.
			if(!(no >= 1 && no <= 10)) {
				System.out.println("** 좌석 번호는 1~10까지만 가능합니다.");
				--j;
				continue;
			}
			
			// 이미 예약되어 있는 자리에는 예약을 받을 수 없다.
			if(seat[no-1] != null) {
				System.out.println("** 이미 예약된 좌석입니다.");
				--j;
				continue;
			}
			seat[no-1] = name; 
		}
		scanner.close();
	}
}
