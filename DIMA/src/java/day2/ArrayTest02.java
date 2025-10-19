package java.day2;


public class ArrayTest02 {

	public static void main(String[] args) {
		
		// 1
		int[] ary = new int[10];         // 배열 생성         

		
		// 배열 초기화 
		for(int i = 0; i < ary.length ; ++i) {
			ary[i] = i + 1;
			
		}

		// 배열 출력 
		for(int i = 0; i < ary.length ; ++i) {
			System.out.printf("%d ", ary[i]);
		}
		
		System.out.println();
		
		// 배열 생성 2 - 가능하지만 비추, 거의 사용 X
		int[] ary2 = new int[] {1, 2, 3, 4, 5};    // 특정한 값을 가진 상태로 초기화
		
		// 배열 출력 
		for(int i = 0; i < ary2.length ; ++i) {
			System.out.printf("%d ", ary2[i]);
		}
		
		System.out.println();
		
		// 배열 생성 3
		int[] ary3 = {1, 2, 3, 4, 5};
		
		// 배열 출력 
		for(int i = 0; i < ary3.length ; ++i) {
			System.out.printf("%d ", ary3[i]);
		}
		
	}
}
