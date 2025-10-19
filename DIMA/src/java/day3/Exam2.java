/*
 * [문제] 키보드로 정수를 입력받아 그 값이 소수인지 아닌지 판별하는 메소드를 작성하시오 
 * 
 * public static boolean isPrime(int number); 
 * 
 * 소수로 판정되면 true, 아니면 false 반환 
 * 
 * 
 */
package java.day3;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		int number; 
		
		System.out.println("정수를 입력 : ");
		number = key.nextInt();
		
//		boolean result = isPrime(number);
//		System.out.println(result);
		if(isPrime(number)) {
			System.out.println(number + "는 소수입니다.");
		} else {
			System.out.println(number + "는 소수가 아닙니다.");
		}
		
		key.close();
	}

	
	// 내 코드
//	public static boolean isPrime(int number) {
//		boolean prime;
//
//		prime = true;
//
//		for(int i = 2; i < number; ++i) {
//			if(number % i == 0) 
//				prime = false; break;
//		}
//
//		return prime;
//	}
//	
	
	// 교수님 코드
	public static boolean isPrime(int number) {
		for(int i=2; i<number; ++i) {
			if(number % i == 0) return false;
		}
		return true;
	
	}
	
}
