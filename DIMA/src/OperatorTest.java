/*
 * 1) 피연산자의 개수
 * 		- 단항(Unary) : 피연산자가 한 개 ; a++, a-- (피연산자는 무조건 변수)
 * 		- 이항(Binary) : 피연산자가  두 개 
 * 		- 삼항(Ternary) : 피연산자가 세 개 ; ( ) ? a : b
 * 
 * 2) 연산의 결과값에 따라
 * 		- 산술연산 : + - * / %
 * 		- 비교연산 : >(greater than,초과) <(less than, 미만) >=(greater equal, 이상) <=(less equal, 이하) ==(equal, 동일) !=(not equal, 같지 않다.)
 * 		- 논리연산 : && (and)  || (or)  ! (not) (단항연산) - numpy의 경우 &, 기본 파이썬은 and 사용 
 * 
 * 
 * 
 *
 */
public class OperatorTest {

	public static void main(String[] args) {
		int data1 = 25, data2 = 31; 
		double result;
//		result = data1 + data2; // 이항 연산자
		
		result = data1 / (double) data2; // 나누기는 데이터 타입 중요 -> data1은 int , data2를 double로 형변환 시킨 경우 결과는 double -> result의 데이터 타입을 double로 
		result = data2 / data1; // 몫
		result = data2 % data1; // 나머지
		
		// 15세 이상은 청소년, 미만은 어린이라고 출력하시오 
		int age = 15;
		
		if(age >= 15) System.out.println("청소년");
		else 		  System.out.println("어린이");
		
		// ------------ 논리연산 (할인은 65세 이상, 8세 미만)
		int fee = 35000;
		
//		(  8 <= age <  65 ) 자바에서는 사용 불가능한 표현식 (파이썬만 가능)
		// 8 <- age 먼저 연산 -> true < 65 (논리연산 불가능) -> Error
		if ( age >= 8 && age < 65 ) 
			System.out.println("입장료: " + fee);
		else						
			System.out.println("입장료: " + (int)(fee * 0.2));
		
		if (!(age >= 8 || age < 65))
			System.out.println("입장료: " + fee);
		else						
			System.out.println("입장료: " + (int)(fee * 0.2));
		
		if (age >= 8 || age < 65)
			System.out.println("입장료: " + (int)(fee * 0.2));
		else						
			System.out.println("입장료: " + fee);
		
	}

}
