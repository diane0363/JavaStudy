package java.day4;

public class MethodOverloading_1 {

	public static void main(String[] args) {
		System.out.println("정수 합의 결과는 " + add(15, 20));    // 
		
		System.out.println("실수 합의 결과는 " + add(15.5, 22.7)); // 매개변수의 타입이 다름 -> 메소드 오버로딩 
		
		System.out.println("Float 실수 합의 결과는 " + add(15.5F, 22.7F));  // 세번째 add 호출 (int는 Float 보다 데이터 타입의 크기가 작기 때문에 담을 수 X. double은 가능)
		
		System.out.println();
	}
	
	// 메소드 오버로딩 3개 
	public static int add(int a, int b) {
		return a + b;
		
	}
	
	public static void add(int a) {
		System.out.println(a + 10);
		
	}	
	public static double add(double a, double b) {
		return a + b;
	}
}
