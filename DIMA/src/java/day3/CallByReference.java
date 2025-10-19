// Call By Reference - 참조 주소를 전달하면서 호출하는 방식 (얕은 복사) - Java에서는 Call By Reference를 99% 사용 ( Call By Value 는 거의 쓰지 X ) 
package java.day3;

public class CallByReference {
	
	// main 메소드
	public static void main(String[] args) {
		int[] ary = {10, 20}; 
		
		System.out.printf("a = %d, b = %d%n", ary[0], ary[1]);
		exchange(ary);
		System.out.printf("a = %d, b = %d%n", ary[0], ary[1]);
		// exchange 메소드가 종료되면서 지역 변수는 사라짐 -> 기존의 a, b값만 남는다. -> 변화 X -> Call by value 
		// main과 exchange의 메소드의 a, b는 같은 변수가 아니다.!
		
	} 
	
	public static void exchange(int[] a) {   // 받을 데이터의 타입을 정확히 알아야한다. -> ary와 동일한 타입으로 // integer 배열 주소를 받게 된다. (얕은 복사)  
		int temp;
		temp = a[0];
		a[0] = a[1];
		a[1] = temp;

//		System.out.printf("a = %d, b = %d%n", a[0], a[1]);

	}
	
}