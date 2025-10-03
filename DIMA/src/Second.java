// Source Code (*.java - src 폴더) ---(compile: 저장하면 자동 컴파일) ---- Byte code 변환 (*.class - bin폴더) ---- Build
// 저장을 할 때 자동으로 Byte code로 변환해준다. (자동 컴파일)
// javac.exe 가 Byte code로 변환시켜준다.


/*
 * 각종 데이터 출력해보기 
 */
public class Second {
	public static void main(String[] args) {
		// 값 (Literal)
		System.out.print("KITA DIMA 5기");          // 문자열 - 참조형 (class타입) 
		System.out.println("2025년 4월 28일");    // escape 문자열(\n)이 코드에 담겨있음
		System.out.println("월요일");
		System.out.println();              // sysout 치고 ctrl+space 누르기
		System.out.println(3.14195);       // 실수 (double) 
		System.out.println(15);            // 정수 (int) 
		System.out.println(true);          // 진위형 (boolean)
		System.out.println('★');              // 문자 (char - 홑따옴표, 문자열X, 딱 한 문자만 입력.) -> 컴퓨터 내부에서 숫자로 변경됨
		System.out.println();           
		// byte, short는 Literal(값)이 X
		// float, long은 Literal이 특이하게 생김
		System.out.println(42.195F);        // 실수 (float) (f는 대소문자 상관X) (귀찮아서 잘 안 씀)
		System.out.println(25L);            // 정수 (long) - 웹에서 사용할 때 필요할 때가 있다. 
		System.out.println();
		System.out.println(5 * 10);         // int * int ==> int - 연산을 할 땐 타입이 중요하다.
	}
}

class Temp {
	int age;
	int 나이;
}


//public은 파일명과 동일한 클래스만 가질 수 있다. 
// 메인 메서드를 가진 클래스만 public 사용 가능 
// 마우스를 가져다 대면 오류 원인이 뜬다.
// public class Temp -> Error