// Call By Value - 매개변수로 전달되는 값을 복사하여 인수로 전달하는 방식 (원본 복사) 
package java.day3;

public class CallByValue {
	
	// main 메소드
	public static void main(String[] args) {
		int a = 10, b = 20 ; 
		
		System.out.printf("a = %d, b = %d%n", a, b);
		exchange(a, b);
		System.out.printf("a = %d, b = %d%n", a, b);
		// exchange 메소드가 종료되면서 지역 변수는 사라짐 -> 기존의 a, b값만 남는다. -> 변화 X -> Call by value 
		// main과 exchange의 메소드의 a, b는 같은 변수가 아니다.!
		
	} 
	
	public static void exchange(int a, int b) {	// 변수에 할당받은 값 사용
		int temp;   
		temp = a;     
		a = b;     
		b = temp;    

		System.out.printf("a = %d, b = %d%n", a, b);

	}
	
}