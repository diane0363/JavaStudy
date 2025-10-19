/*
 * seat이라는 이름의 방 10개짜리 배열을 생성하시오 
 * 
 * 0은 선택 가능한 방 
 * 
 * (출력 예시)
 * 
 * <선택할 수 있는 방>
 * 0 0 0 0 0 0 0 0 0 0 
 * 
 * 몇 번 방 선택? 1
 * 1 0 0 0 0 0 0 0 0 0
 *
 * <선택할 수 있는 방>
 * 1 0 0 0 0 0 0 0 0 0
 * 
 * 몇 번 방 선택? 1
 * 다시 선택하세요 
 * 
 * 몇 번 방 선택? 15
 * 선택할 수 없습니다. 종료합니다.
 */
package java.day2;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		// 나으 풀이 
		Scanner key = new Scanner(System.in); 
		int[] seats = new int[10];
		int num;
	

		while(true) {
			System.out.println("<선택할 수 있는 방>");
			for(int i = 0; i < seats.length; ++i) {
				System.out.printf("%d ", seats[i]);
			}
			System.out.println();
			
			System.out.println("몇 번 방 선택? ");
			num = key.nextInt();
			
			if (num > seats.length) {
				System.out.println("선택할 수 없습니다. 종료합니다."); break;
			}
			else if(seats[num-1] == 0) {
				seats[num-1] = 1;
				for(int i = 0; i < seats.length; ++i) {
					System.out.printf("%d ", seats[i]);
				} 					
				System.out.println();
			}
			else if (seats[num-1] == 1) 
				System.out.println("다시 선택하세요.");
		
			System.out.println();
		}
		key.close();
	
		
		// 교수님 풀이 
		// 1) 변수 선언 
		Scanner scanner = new Scanner(System.in);
		int[] s = new int[10];
		int choice;
		int count = 0;   // 예약 완료된 방의 개수 : 10이 되면 종료 
		
		
		/* 반복적으로 입력을 받기 
		 * - while(true)
		 * 		10을 벗어난 값을 입력하면 종료 
		 * 		모든 방이 모두 1이 되면 종료 
		 * 
		 * 	- for 문을 이용해 현재 방의 상태 출력  
		 * 	- 입력 (선택을 함) 
		 * 		10을 벗어난 값을 입력하면 종료 
		 * 	- 해당 방에 값을 확인 
		 * 		- 이미 선택된 상태 => 선택 X 다시 입력 
		 * 		- 선택할 수 있으면 선택 
		 */
		
		while (true) {
			// 방 상태 출력 
			System.out.println("<< 예약된 방 상태 >>");
			for(int i = 0 ; i < s.length; ++i) {
				System.out.print(s[i] + " ");
			}
			System.out.println("\n");
			
			// 예약 
			System.out.println(" ** 몇 번 방 ? ");
			choice = scanner.nextInt();
			
			if(choice < 1 || choice > s.length) {
				System.out.println("선택 불가.");
				return; // 프로그램 종료 ***************** // break도 사용 가능. 하지만 반복문 하나만 벗어난다.
			}
			
			if(s[choice - 1] == 1) {
				System.out.println((choice -1) + "번  방은 이미 예약. 다시 선택");
				continue;
			}
			
			s[choice - 1] = 1;
			count++;    // 만 석
			
			if(count >= 10) {
				System.out.println("전체 예약 완료");
				return;
			}
		}
		
	}

}













