package java.day3;
public class MethodTest_5 {

	public static void main(String[] args) {
		int[][] a = {{1, 2}, {3, 4}, {5, 6}};
		methodA(a);

		String[] s = {"ab","cd","ef"}; // String은 힙저장 X / pool에 저장 -> new String X 
		methodS(s);
		
		// methodB를 호출해서 반환값을 받아보시오 
		double result = methodB();
		System.out.println(result);
		
		// [문제] methodC를 호출하고 결과값을 받아 출력하는 완성된 코드 작성 
		double[] d = {1, 2, 3, 4, 5};
		double dd = methodC(d);
		System.out.println(dd);
		
		// [문제] methodD() 호출하고 반환되는 결과값을 받는 코드 작성 
		int i = 3;
		int[] ii = methodD(i);		// 호출 + 반환
		System.out.println(ii[2]);	
	}
	
	public static void methodA(int[][] a) {
		
	}
	
	public static void methodS(String[] s) {
		
	}

	public static double methodB() { // 매개변수 X 
		return 4.5; 
	}

	public static double methodC(double[] d) { // 매개변수 X 
		double total = 0 ; 
		for(int i = 0 ; i < d.length ; ++i) {
			total += d[i];
		}
		
		return total / d.length; 
		
	}
	
	
	public static int[] methodD(int size) {
		int[] a = new int[size]; 
		// 배열의 값을 초기화 합니다. (생략)
		
		return a;  // a는 1차원 정수 배열 
	}
	
	public static void methodE() {
		// 출력물 같은 것들 !!!
		// 멤버에 접근하는 것들..
	}
	
//	public static int[] methodD(int size) {
//		int[] a 
//	}
}
