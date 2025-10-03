// 2차원 배열을 이용한 사지선다형 객관식 시험채점 프로그램을 작성하시오. 

// 문제 수만큼 정답 입력 받아 배열에 저장 
// 시험을 치른 학생의 답 입력
// 정답과 학생의 답 비교 => 결과 & 맞은 개수 출력

// final int cnt = 10;
// int[][] answer = new int[2][cnt]     // 0행에는 정답, 1행에는 학생 답
// char[] result = new char[cnt]        // o x 입력
// int rightCnt = 0;                    // 맞춘 개수

import java.util.Scanner;

public class Test28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int cnt = 5;
		int rightCnt = 0;
		
		int[][] ans = new int[2][cnt];
		char[] result = new char[cnt];
		
		for (int i = 0; i<2 ; i++) {

			if ( i == 0 ) {
				System.out.printf("정답 입력 (1~4) : ");				
				for (int j = 0; j<5; j++) {
					ans[i][j] = sc.nextInt();
				}			
			} else {
				System.out.printf("학생 답 입력 (1~4) : ");			
				
				for (int j = 0; j<5; j++) {
										
					ans[i][j] = sc.nextInt();
					
					if (ans[0][j] == ans[1][j]) {
						result[j] = 'o';
						rightCnt++;
					} else {
						result[j] = 'x';
					}

					System.out.printf("%c ", result[j]);
				}
				System.out.printf("(맞은 개수 : %d개)", rightCnt);
			}
			
			
			
		}
		
		sc.close();

				
	}
}
