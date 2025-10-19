package java.day3;

public class ArrayObjectTest_2 {

	public static void main(String[] args) {
		String[] s;             // 문자라는 배열을 생성하겠다.
		s = new String[10];     // 초기화 (아무 값도 참조 X - null값을 가진다.)
				// 길이 10짜리의 String 참조 배열 객체가 힙에 생성 & 어떤 문자열 객체도 가리키지X 
		
		int[] iary = new int[] {1, 2, 3, 4, 5, 6, 7};   // 생성 + 초기화 2
		int[] iary2 = {1, 2, 3, 4, 5, 6, 7};            // 생성 + 초기화 3
		
		String[] sary = new String[] {"월", "화", "수"};   // 3개의 방 자동 생성  
		String[] sary2 = {"월", "화", "수"};               // 객체 배열
		
//		String name = new String("전우치");      // 배열 X, 단일 변수 
		String name = "전우치";            // 단일 변수는 new String 생략 가능

//		String[] sary = new String[] {new String{"월"), new String("화"), new String("수")} // 원래 이게 맞음 (정확한 객체 생성 표현법) 
			
		for(int i = 0; i < s.length; ++i) 
			System.out.println(s[i]);
	}

}
