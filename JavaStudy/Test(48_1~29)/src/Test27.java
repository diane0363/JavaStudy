// 알파벳 ‘A’ ~ ‘z’까지 해당 문자와 코드값을 모두 출력하시오
// 연산자, 단일 for문, continue 이용
// 특수 문자 제외

public class Test27 {
	public static void main(String[] args) {
		
//		char code;
		
		for (int i = 65; i < 123; i++) {
			if (i > 90 && i < 97) {
				continue;
			}
			
//			code = (char)i;
//			System.out.printf("%s : %d%n", code, i);

			System.out.printf("%s : %d%n", (char)i, i);
			
		}
	}
}
