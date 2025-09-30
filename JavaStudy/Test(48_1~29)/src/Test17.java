// 1~10까지 자연수를 모두 더한 합계를 출력하시오. 

public class Test17 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; ++i) {
			sum += i;
		}
		System.out.println(sum);
	}
}
