package java.day3;

public class ArrayTest_1 {

	public static void main(String[] args) {
		// 1차원 배열
		int[] iary1 = new int[5];
		
		// 2차원 배열 
		int[][] iary2 = new int[3][4];  // 3행 4열  -> 참조값을 한번 따라가도 실제 값이 아닌 또 다른 참조값 3개 존재 (행배열) -> 2번 따라 가야 값이 나온다.(열배열)
		
//		System.out.println(iary2);     // 행 참조 (주소값 리턴)  // [[ 대괄호 2개 -> 2차원 배열 참조
//		System.out.println(iary2[0]);  // 열 참조 (주소값 리턴)  // [ 대괄호 1개 -> 1차원 배열 참조
//		System.out.println(iary2[1]);  // 열 참조
//		System.out.println(iary2[2]); 	 
//		
//		System.out.println(iary2[0][0]);  // 실제값 리턴 
		
		int iary3[][] = new int[3][4];  // 문법적으로 허용 가능 (좋은 표현은 X) 
		int[] iary4[] = new int[3][4];  // 문법적으로 허용 가능 (마찬가지)
		
		// 초기화
		int[][] iary5 = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};  // 3행 4열
		
		// 출력은 2중 for문 이용 
		// 전통적 방식 for문,,
		for(int i = 0 ; i < iary5.length ; ++i) {  // 행접근 for문 
			for(int j = 0; j < iary5[i].length; ++j) {    // 열접근 for문
				System.out.printf("%3d", iary5[i][j]);
			}
			System.out.println();  // 줄바꿈
		}
		
		// 향상된 방식의 for문
		for(int[] temp: iary5) { // 일차원 배열 묶음 {1,1,1,1}이 리턴되기 때문에 int[]로 받아줘야한다.
			for(int data: temp) {  
				System.out.printf("%3d", data);  // 열데이터 출력 코드 
			}
			System.out.println();
		}
		
	}

}
