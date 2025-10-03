
public class VarDec {

	public static void main(String[] args) {
		// %d
		byte b = 125; 
		short s = 300;
		int i = 14556, j = 500; // 연달아서 선언 가능 
		long l = 350L; 
		
		// %c
		char c = '^';  
		
		// %f
		float f = 1.5F; 
		double d = 35.8; // double 과 int가 연산의 디폴트 타입 
		
		// 참조형 %s
		String str = "Korea"; // String 은 대문자로 시작! 
		
		System.out.printf("%d, %c, %.2f, %s, %.2f%%\n", i, c, d, str, f);
		System.out.printf("%6d, %c, %.2f, %s, %.2f%%%n", i, c, d, str, f);
		System.out.printf("%,6d, %c, %.2f, %s, %.2f%%%n", i, c, d, str, f);

//		System.out.println(str.toUpperCase());  // 대문자 변환
		

	}

}
