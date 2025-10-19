/*
 * 2 x 1 = 2  3 x 1 = 3  4 x 1 = 4  ... 
 * 2 x 2 = 4  ...
 */
package java.day2;

public class ForTest03 {

	public static void main(String[] args) {

		int dan; // 2~9단

		for (int i = 1; i <= 9; ++i) {
			for (dan = 2; dan <= 9; ++dan) {
				System.out.printf("%d x %d = %d\t", dan, i, (dan * i));
			}
			System.out.println();
		}

		// 교수님 풀이
		for (int i = 1; i <= 9; ++i) {
			for (dan = 2; dan <= 5; ++dan) {
				System.out.printf("%d x %d = %d\t", dan, i, (dan * i));
			}
		}
		System.out.println();

		for (int i = 1; i <= 9; ++i) {
			for (dan = 6; dan <= 9; ++dan) {
				System.out.printf("%d x %d = %d\t", dan, i, (dan * i));
			}
		}
		System.out.println();

		// // 3중 for문
		// for (int j = 4; j >= 1, --j) {
		// for(int i = 1; i <= 9; ++i) {
		// for(int dan = 2; dan <= 5; ++dan) {
		// System.out.printf("%d x %d = %d\t", dan, i, (dan*i));
		// }
		// }
		// }
		// System.out.println();

		// 3중 for 문 교수님풀이
		for (int j = 2; j <= 6; j += 4) {
			for (int i = 1; i <= 9; ++i) {
				for (dan = j; dan <= j + 3; ++dan) {
					System.out.printf("%d x %d = %d\t", dan, i, (dan * i));
				}
				System.out.println();
			}
		}
	}
}
