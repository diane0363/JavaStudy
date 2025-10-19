package java.day3;

public class MethodTest_1 {
	
	// main 메소드
	public static void main(String[] args) {
		
		double result2; 
		
		int result = plus(10, 20);   // 반환된 타입 반환값 변수 = 메소드 
		System.out.println(result);
		
		result = minus(10, 7);   // 재할당 ( 재선언 불가 ( 선언 : int result ) ) 
		System.out.println(result);
		
		
		result = multiply(5, 10);
		System.out.println(result);
		
		result2 = divide(5,10);
		System.out.println(result2);
		// static 메소드 내부에서는 non-static 메소드 호출 불가!!
//		output();  // Error 
		
	}
	
	
	// static 메소드 정의 
	// method signiture {method body}
	public static int plus(int a, int b) {
		return a + b;
	}
	
	public static int minus(int a, int b) {
		return a - b; 
	}


	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static double divide(int a, int b) {
		return a / (double)b;   // double 형변환을 해주지 않으면, 5 / 10 ==> 0
	}

	
	// instance 메소드 : 메소드가 포함된 클래스를 생성한 후 호출 가능 
	// 반환 값 X -> void
	public void output() {
		System.out.println("나는 출력메소드!!");
		return;       // 그 메소드의 마지막에 있을 경우 생략 가능 -> }가 return을 대신 
	}
	
}
