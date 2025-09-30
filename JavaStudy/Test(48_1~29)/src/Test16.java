// while , break, continue

//달걀의 무게를 입력 받아 달걀을 포장하는 프로그램을 작성하라.  
//달걀의 무게를 입력 받아 무게가 150g 이상이면 포장하고, 150g 미만인 것은 포장에서 제외하여 
//총 10개의 달걀을 한 박스 포장하는 프로그램을 작성하라. 
//프로그램 작성 시 무한 반복문과 break와 continue문을 활용하여 작성한다. 

import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int total = 0;
		
		while (true) {
			System.out.println("* 달걀 무게 (g단위) :");
			int weight = sc.nextInt();

			if (weight < 150) {
				System.out.println("메추리알 가지고 장난하지 마시오~");
				continue;
			} else {
				total += 1;
				System.out.printf("* 달걀개수 : %d개%n",total);
			}
			
			if (total == 10) {
				break;
			}
		}
		
		System.out.println("**** 달걀 포장이 끝났습니다.");
		
		sc.close();

	}
}
