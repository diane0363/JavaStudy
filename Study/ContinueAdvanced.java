import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContinueAdvanced {

    // 예: "id,age,password" 형태의 레코드
    private static final String[] RECORDS = {
            "alice,20,Passw0rd",
            "bob,17,passw0rd", // 대문자 없음 -> 스킵
            "alice,30,Password1", // 중복 ID -> 스킵
            "charlie,200,Abc1", // 나이 범위 -> 스킵
            "david,25,NoDigitsHere", // 숫자 없음 -> 스킵
            "eve,25,P ass1", // 공백 포함 -> 스킵
            "frank,25,GoodPass9" // OK
    };

    public static void main(String[] args) {
        Set<String> seenIds = new HashSet<>();
        Map<String, Integer> skipReasons = new HashMap<>();

        int okCount = 0;

        // 레코드 단위 처리
        RECORD_LOOP: // 라벨 continue RECORD_LOOP; 를 쓰면 상위 for문이 아닌 해당 for문으로 넘어간다.
        for (String record : RECORDS) {
            String[] parts = record.split(",");
            if (parts.length != 3) { // 데이터 3개 체크(id, age, pwd)
                inc(skipReasons, "FORMAT");
                continue;
            }

            String id = parts[0].trim();
            String ageStr = parts[1].trim();
            String password = parts[2];

            // 1) ID 중복 체크
            if (seenIds.contains(id)) {
                inc(skipReasons, "DUPLICATE_ID");
                continue;
            }

            // 2) 숫자 파싱 + 범위 체크
            int age;
            try {
                age = Integer.parseInt(ageStr);
            } catch (NumberFormatException e) {
                inc(skipReasons, "AGE_NOT_NUMBER");
                continue;
            }
            if (age < 18 || age > 120) {
                inc(skipReasons, "AGE_RANGE");
                continue;
            }

            // 3) 비밀번호 규칙 검사(여러 조건)
            // 조건: 길이>=8, 공백 없음, 대문자 포함, 숫자 포함
            if (password.length() < 8) {
                inc(skipReasons, "PW_TOO_SHORT");
                continue;
            }

            // 플래그
            boolean hasUpper = false;
            boolean hasDigit = false;

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                // 공백 체크
                if (Character.isWhitespace(ch)) {
                    inc(skipReasons, "PW_HAS_SPACE");
                    continue RECORD_LOOP; // <- 라벨 continue: 이 레코드는 즉시 탈락 처리

                }
                // 대문자
                if (Character.isUpperCase(ch))
                    hasUpper = true;
                // 숫자
                if (Character.isDigit(ch))
                    hasDigit = true;
            }

            if (!hasUpper) {
                inc(skipReasons, "PW_NO_UPPER");
                continue;
            }

            if (!hasDigit) {
                inc(skipReasons, "PW_NO_DIGIT");
                continue;
            }

            // 여기까지 왔다 = OK 레코드
            seenIds.add(id);
            okCount++;
            System.out.println("OK: id=" + id + ", age=" + age);
        } // 레코드 반복 끝

        System.out.println("----");
        System.out.println("OK count = " + okCount);
        System.out.println("Skip reasons = " + skipReasons);
    }

    // .getOrDefault : 기존 key가 있으면 해당 value, 없으면 0 을 가져온다.
    private static void inc(Map<String, Integer> map, String key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }
}