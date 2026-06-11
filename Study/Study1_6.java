/*
 * 만나이 계산 1_6
 * 메인 메소드 try-catch 추가
 * 메인 메소드 try-with-resource 추가
 * 현재날짜, 출생일 비교 체크 로직 추가
 * 
 * 1. 출생일 입력
 * 2. 현재일 입력
 * 3. 입력값 검증 -> 8자리 숫자인가?, 현재보다 출생일이 빠른가? -> 실패 시 다시 입력
 * 4. 나이 계산
 * 4-1. 연도 빼기
 * 4-2. 월일 비교 -> 출생 < 현재 => 그대로 / 출생 > 현재 => -1
 */

import java.util.Scanner;

public class Study1_6 {
    // public static void main(String args[]){

    // }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                try {
                    String birth = inputData(sc, "출생 날짜(8자리) : ");
                    String current = inputData(sc, "현재 날짜(8자리) : ");

                    int age = calculateAge(birth, current);
                    System.out.println("만 나이 : " + age);

                    break; // 나이를 계산하면 while 문 탈출!!

                } catch (IllegalArgumentException e) {
                    System.out.println("오류 : " + e.getMessage());
                    System.out.println("데이터를 다시 입력해주세요");
                }
            }
            // sc.close();
        }
    }

    // 입력 값 검증
    public static String inputData(Scanner sc, String msg) {
        while (true) {
            System.out.println(msg);
            String date = sc.next();

            if (!date.matches("[0-9]{8}")) {
                System.out.println("날짜는 8자리 숫자로 입력해주세요");
                continue;
            }

            return date;

        }
    }

    // 나이 계산
    public static int calculateAge(String birth, String current) {
        if (birth == null || current == null) {
            throw new IllegalArgumentException("날짜값은 null일 수 없음");
        }

        if (birth.length() != 8 || current.length() != 8) {
            throw new IllegalArgumentException("날짜는 반드시 8자리");
        }

        if (birth.compareTo(current) > 0) {
            throw new IllegalArgumentException("현재 날짜는 출생일보다 이후여야 합니다.");
        }

        // int age = Integer.parseInt(birth.substring(0, 4))
        // - Integer.parseInt(current.substring(0, 4));

        int age = Integer.parseInt(current.substring(0, 4))
                - Integer.parseInt(birth.substring(0, 4));

        // 생일 전까지는 -1
        if (birth.substring(4).compareTo(current.substring(4)) > 0) {
            age--;
        }

        // 오늘이 생일인 경우에도 나이 감소 (경계값 버그)
        // if (birth.substring(4).compareTo(current.substring(4)) >= 0) {
        // age--;
        // }

        return age;
    }
}
