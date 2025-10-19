/*
 * 10개짜리 정수 배열을 선언하고 생성한 후 
 * 1 ~ 100사이의 정수를 발생시켜 저장하고 합계를 구하여 출력하시오. 
 * 
 * <실행 예>
 * 1 5 3 6 7 8 2 1 10 88 99 33
 * 합계 : xxx
 * 
 */
package java.day2;

public class Exam03 {

	public static void main(String[] args) {
		
		// 나의 풀이 --------------- 난수 발생 후 변수에 저장 후 배열에 저장 
		int[] ary = new int[10];
		int num, sum = 0;
		
		for(int i = 0; i < ary.length; ++i) {
			num = (int)((Math.random()) * 99 + 1);
			ary[i] = num;
			sum += ary[i];
			System.out.print(ary[i] + "   ");
		}	
		System.out.println("\n" + "합계: " + sum);
	
		
		// 교수님 풀이 ------------ 난수 발생후 바로 배열에 저장
		int[] iary = new int[10];
		int total = 0;
		
		for(int i = 0; i < iary.length; ++i) {
			iary[i] = (int)(Math.random() * 100 + 1);
			total += iary[i];
		}
	
		// 출력 
		for(int i=0; i<iary.length; ++i) {
			System.out.printf("%-4d ", iary[i]);      // %-4 왼쪽 정렬 
		}
		System.out.println("\n\n합계: " + total);
		
	}
	
	

}


