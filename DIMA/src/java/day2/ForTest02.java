/*
 * 반복문을 이용해서 전체 구구단 출력
 */
package java.day2;

public class ForTest02 {

	public static void main(String[] args) {
		int dan;   // 2~9단 

		for(dan = 2; dan <= 9 ; ++dan) {
			for(int i=1; i<=9; ++i) {
				System.out.printf("%d x %d = %d\n", dan, i, (dan*i));

			}
			System.out.println();
		}
	}

}
