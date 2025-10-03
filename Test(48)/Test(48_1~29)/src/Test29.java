// 좌석이 10개 있는 소극장에 예약을 받는 시스템을 작성하려고 합니다. 
// 예약자의 이름과 좌석 1~10을 입력 받아 전체 출력하는 프로그램을 작성하세요. 

import java.util.Scanner;

public class Test29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[10];
		String name;
		int seat = 0;
		int cnt = 0;
		
		while (true) {
			System.out.println("=== 좌석 예약 상태 ");

			for (int i = 0; i<10 ; i++) {
				if (arr[i] == null) {
					System.out.printf("[   ]");					
				} else {
					System.out.printf("[%s]",arr[i]);
				}
			}
			
			System.out.println();
			
			System.out.printf("%n예약자 이름 입력 : ");
			name = sc.next();
			System.out.println("좌석 입력 (1~10) : ");
			seat = sc.nextInt() - 1;
			
			if (seat < 0 || seat > 9) {
				System.out.println("## 예약 다시 진행 ");
				continue;
			} else if (arr[seat] == null) {
				arr[seat] = name;
				cnt++;
			} else {
				System.out.println("(warning) 이미 예약된 좌석입니다.");
				continue;
			}
			
			if (cnt == 10) {
				System.out.println("# 모든 예약 완료되어 종료");
				break;
			} 

		}
		
		sc.close();
	}

}
