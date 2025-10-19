/*
* 가변 인자 메소드 (타입 ... 변수명) 
*	- printf가 가변인자 메소드임  => Object ... args 
* 	- printf(String format, Object ... args) 
* 		- Object는 모든 데이터 타입을 받는다.
*		- ... 은 여러 개의 인자가 들어올 수 있다는 의미인 듯. 그래서 가변 인자는 제일 마지막에 작성해야한다! (반환 타입은 하나만!!)
*	- double dbl, int ... data -> 가능  (나머지 모두 정수형 인자가 들어온다.)
*	- int ... data, double dbl -> 불가능!!! (몇 개가 올지 모르기 때문에)
*/
package java.day4;

public class MethodTest_1 {

	public static void main(String[] args) {
		
		int a = add(1, 2);
		int b = add(1, 2, 3);
		
		// printf는 대표적인 가변인자 메소드 

		
		System.out.printf("sljf%n"); 
		System.out.printf("1 + 2 = %d%n",a); 
		System.out.printf("1 + 2 = %d%n1 + 2 + 3 = %d",a,b); 
	}
	// 모든 상황을 가정하고 오버로딩하게 되는 상황 -> 가변 인자 메소드
//	public static int add(int a, int b) {
//		return a + b;
//	}
//	public static int add(int a, int b, int c) {
//		return a + b + c;
//	}



	public static int add(double dbl, int ... data) {  // 반환 타입은 하나만, 
		int total = (int) dbl; 
		for(int i = 0; i < data.length; ++i) {
			total += data[i]; 
		}
		return total; 
	}
}	