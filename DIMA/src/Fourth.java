
public class Fourth {

	public static void main(String[] args) {
		byte by = 1;
		short sh = 2;
		int i = 45;
		long lng = 450L;
		
		float fl = 3.1f;
		double dbl = 3.5;
		
		boolean bool = true; 
		
		// 문자형 (정수 범주에 포함) 
		// 'a' ==> 97 
		char ch = 'a'; // 유니코드 (2byte) --> 97 
		int temp = ch + 1;
		System.out.println(ch);    // a	
		
		ch = (char)(ch + 1);  // 강제 형 변환 - 연산 후 형 변환을 시켜서 저장 
		System.out.println(ch);    // b

		ch = (char)(ch - ' ');  // 97 - 32 = 65
		System.out.println(ch);    // B (대문자가 작은 값)

		System.out.println(temp);  // 98
		// char타입은 음수가 없다.
//		short (음수o), char(음수X) 
//		하지만 short 와 char은 바이트 수가 같기 때문에 서로 캐스팅이 불가능하다. 
	}

}
