/*
 * 2 ~ 100 사이의 모든 소수를 출력 
 */
package java.day3;

public class Exam3 {

	public static void main(String[] args) {
		int count = 0;
		
		
		for(int number = 2 ; number <= 100 ; ++number) {
			if(isPrime(number)) {
				System.out.println(number + " ");
				++count;
			} else {
				System.out.println(number + "는 소수가 아닙니다.");
			}
		}
		System.out.println("\n2~100사이의 소수의 개수: " + count + "개");
	}

	
	
	// 교수님 코드
	public static boolean isPrime(int number) {
		for(int i=2; i<number; ++i) {
			if(number % i == 0) return false;
		}
		return true;
		// boolean타입 - 무조건 t나 f로 리턴 
	
	}
		

}
