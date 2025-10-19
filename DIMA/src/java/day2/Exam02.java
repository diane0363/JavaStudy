package java.day2;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		int[] data = {5, 1, 7, 14};
		int temp;
		
//		// 내림차순 정렬
//		if (data[0] < data[1]) {
//			temp = data[0];
//			data[0] = data[1];
//			data[1] = temp;
//		}
//		
//		if (data[0] < data[2]) {
//			temp = data[0]; 
//			data[0] = data[2];
//			data[2]= temp;
//		}
//		
//		if (data[1] < data[2]) {
//			temp = data[1];
//			data[1] = data[2];
//			data[2] = temp;
//		}

		// 정렬 전 출력
		System.out.println("정렬 전");
		for(int i = 0 ; i < data.length; ++i) {
			System.out.print(data[i] + "   ");
		}
		System.out.println();
		
		// 내림차순 정렬 (교환정렬) -> 빅오(Big-O)표기법 
		// Big-O : 입력 크기 대비 실행 시간 증가율 (최악의 결과 기준)
			// O(1) : 배열 인덱스 접근 (HashMap 접근 - 키로 데이터를 바로 찾음)
			// O(n) : 단순 반복문 ( 앞에서 부터 전부 비교 ) 
			// O(n²) : 중첩 반복문 (버블 정렬 - 인접한 두개 비교후 큰 값을 뒤로)
			// O(log n) : 이진 탐색 (배열이 정렬되어 있을 때만 사용가능)
			// O(n log n) : 병합 정렬(배열을 반으로 쪼개서 각각 정렬 - 분할 정복), 
						// 퀵 정렬 ( 기준값(pivot)을 정해서 작은 건 왼쪽 큰건 오른쪽 분할)
							// pivot이 한쪽으로 치우치면 O(n²) 이 될 수 있다. 
						// => 대표 효율 등급, 가장 빠른 범용 정렬
		// 오름차순을 하고 싶으면 부호 방향만 바꿔주면 된다 ! 
		for(int i = 0; i < data.length; ++i) {
			for(int j = i; j < data.length; ++j) {
				if (data[i] < data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}

		
		// 출력
		// 정렬 전 출력
		System.out.println("정렬 후");
		for(int i = 0 ; i < data.length; ++i) {
			System.out.print(data[i] + "   ");
		}
		System.out.println();

	}

}


