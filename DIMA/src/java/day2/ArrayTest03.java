package java.day2;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		int[] ary = new int[10];
		int number;
		
		// 초기화 
		for(int i = 0; i < 10; ++i) {
//			System.out.println(Math.random());    // [0,1) 실수
//			ary[i] = (int)(Math.random() * 99 + 1);      // 1 ~ 99 
			// ary는 정수 배열이기 때문에 형 변환 필수 -> 0만 들어가기 때문에 10을 꼭 곱해주기 -> 0 ~ 10 
			
			number = (int)(Math.random() * 99 + 1);
			// 3이나 8의 배수인 경우에만 배열에 저장 
			
			if(number % 3 == 0 || number % 8 == 0) 
				ary[i] = number;
			else 
				--i;       // 3의 배수나 8의 배수가 아닌 경우 다시 생성 
		}
		
		// 값 출력
		for(int i = 0; i < ary.length; ++i) {
			System.out.printf("%d\t",ary[i]);			
		}
		System.out.println();
		
		// 값을 서로 바꾸기 0<->9 / 1<->8 / ..
		int temp;
		for(int i = 0; i < (ary.length)/2; ++i) {
			temp = ary[i];
			ary[i] = ary[ary.length-(i+1)];
			ary[ary.length-(i+1)] = temp;	
		}

		// 값 출력
		for(int i = 0; i < ary.length; ++i) {
			System.out.printf("%d\t",ary[i]);			
		}

	}	
}
