/*
 * 10개짜리 정수 배열을 선언하고 생성한 후 
 * 1 ~ 100사이의 정수를 발생시켜 저장하고 출력하시오. 
 * 단, 동일한 값을 발생시켰을 경우 배열에 저장 X 
 * 
 * <실행 예>
 * 1 5 3 6 7 8 2 1 10 88 99 33
 * 
 */
package java.day2;

public class Exam04 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		int temp;
		
		for(int i = 0; i < ary.length; ++i) {
			temp = (int)((Math.random()) * 99 + 1);
			if (i != 0) {
				for(int j = 0; j < i; ++j) {
					if(ary[j] == temp) {           // 문장이 두개면 꼭 중괄호로 묶어주기!!!!!!!!!!!!!!!!!!!!!!!
						temp = (int)((Math.random()) * 99 + 1);
						--j; }
					}
			}
			ary[i] = temp;
			System.out.print(ary[i] + "   ");
		}	

		
		// 교수님 풀이 
		int[] data = new int[10];
//		int num;
		
		for(int i=0; i < data.length; ++i) {
			data[i] = (int)(Math.random() * 100 + 1);
			
			// 이미 data 배열에 입력된 숫자와 동일한 숫자인지 0번부터 확인 -> 동일하면 다시 생성
			for(int j = 0; j < i - 1 ; ++j) {
				if(data[i] == data[j]) {
					--i;
					break;
				}				
			}
			}
		// data 배열의 숫자 출력
		for (int i = 0 ; i < data.length ; ++i) {
			System.out.printf("%-4d    ",data[i]);

		System.out.println();
		}
	}
}





