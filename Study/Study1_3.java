
/* 
만 나이 계산하기 1-3
    - while문으로 validation 추가
 */
import java.util.Scanner;

public class Study1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String birth = "";
        String current = "";

        while (true) {
            // while 문 안에서 생성된 변수는 while문 안에서만 시효
            System.out.println("생년월일(8자리 입력): ");
            // String birth = sc.next();
            birth = sc.next();

            System.out.println("현재 날짜(8자리 입력): ");
            // String current = sc.next();
            current = sc.next();

            // validation check
            if (!birth.matches("[0-9]{8}") || !current.matches("[0-9]{8}")) {
                System.out.println("8자리 숫자만 입력해야합니다.");
                continue;
            }

            // ok
            break;
        }

        int age = Integer.parseInt(current.substring(0, 4))
                - Integer.parseInt(birth.substring(0, 4));

        // compareTo
        // 문자열을 앞에서부터 차례대로 비교 -> 값이 동일하면 다음 문자 비교
        // 양수나 음수가 나오는 순간 결과 출력
        if (current.substring(4).compareTo(birth.substring(4)) < 0) {
            age--;
        }

        // 혹은
        // age -= current.substring(4).compareTo(birth.substring(4)) < 0 ? 1 : 0;

        System.out.println("만 나이: " + age);

        sc.close();
    }
}
