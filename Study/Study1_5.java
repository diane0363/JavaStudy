/* 
    만 나이 계산하기 1-4
    - 예외 처리 추가
*/

import java.util.Scanner;

public class Study1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String birth = inputData(sc, "생년월일 8자리 입력: ");
        String current = inputData(sc, "현재 날짜 8자리 입력: ");

        int age = calculateAge(birth, current);
        System.out.println("만 나이: " + age);

        sc.close();
    }

    public static String inputData(Scanner sc, String msg) {
        while (true) {
            System.out.println(msg);
            String date = sc.next();

            if (!date.matches("[0-9]{8}")) {
                System.out.println("날짜는 8자리 숫자로 입력해야 합니다.");
                continue;
            }

            return date;
        }
    }

    public static int calculateAge(String birth, String today) {
        // 로직 단의 Null 및 길이 체크
        if (birth == null || today == null) {
            throw new IllegalArgumentException("날짜 값은 null일 수 없습니다.");
        }
        if (birth.length() != 8 || today.length() != 8) {
            throw new IllegalArgumentException("날짜는 반드시 8자리여야 합니다.");
        }

        // 나이 계산
        int age = Integer.parseInt(today.substring(0, 4))
                - Integer.parseInt(birth.substring(0, 4));

        if (today.substring(4).compareTo(birth.substring(4)) < 0) {
            age--;
        }

        return age;
    }
}
