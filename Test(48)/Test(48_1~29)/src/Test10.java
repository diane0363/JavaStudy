//`세균 A는 30분 마다 원래 개체수의 10%씩 증가하는 박테리아이다. 
// 원래 100마리 있었다면 30분 후 110마리, 한시간후 120마리 한시간 30분후 130마리..... 
//처음 있던 박테리아의 수와 경과시간(분)을 입력 받아 증가한 총 세균의 수를 출력하시오.  `

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("박테리아 수");
		double num = Integer.parseInt(br.readLine());
		System.out.println("경과 시간");
		int time = Integer.parseInt(br.readLine());
		
		while (time >= 30) {
			num *= 1.1;
			time -= 30;
		}
		
		System.out.printf("총 박테리아 수 : %.0f", num);
		
//		while (true) {
//			time -= 30;
//			if (time < 0) {
//				break;
//			}
//			num *= 1.1;
//		}
	}
}
