/*
break는 가장 가까운(안쪽) 반복문/switch만 종료한다 (중첩 루프 함정)
중첩 루프를 한 번에 탈출하는 라벨 break(ラベル付きbreak)
실무에선 라벨 break보다 **메서드 추출 + return**이 더 읽히는 경우가 많다
try/finally, try-with-resources 안에서 break를 해도 finally/close는 실행된다

 */

public class BreakBasic {

    public static void main(String[] args) {
        example1_breakInWhile();
        System.out.println();

        example2_breakInFor_search();
        System.out.println();

        example3_breakInNestedLoops_labeled();
        System.out.println();

        example4_breakVsReturn();
    }

    /**
     * while문에서 break: 조건을 만족하는 순간 반복을 "즉시 종료"한다.
     * 
     */
    private static void example1_breakInWhile() {
        System.out.println("[1] break in while");

        int i = 0;
        while (i < 5) {
            if ((i + 2) > 3) {
                System.out.println("break! (i=" + i + ")");
                break;
            }

            System.out.println(i);
            i++;
        }

        System.out.println("loop finished. i=" + i);
    }

    /**
     * for문에서 break: 특정 값을 찾는 순간 탐색을 중단할 수 있다.
     */
    private static void example2_breakInFor_search() {
        System.out.println("[2] break in for (search)");

        int[] nums = { 4, 9, 1, 7, 9, 2 };
        int target = 7;

        int foundIndex = -1;
        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] == target) {
                foundIndex = idx;
                break;
            }
        }

        if (foundIndex >= 0) {
            System.out.println("found target=" + target + " at index=" + foundIndex);
        } else {
            System.out.println("not found target=" + target);
        }
    }

    /**
     * 중첩 루프에서 break는 "가장 안쪽 루프"만 빠져나간다.
     * 바깥 루프까지 한번에 빠져나가려면 라벨 break를 사용할 수 있다.
     * JVM 관점에서 “어디로 점프할지” 타겟이 명확한 `goto` 계열로 컴파일되는 제어 흐름
     * 단, 강력하지만 남용하면 코드 흐름이 복잡해져서 리뷰 비용이 커짐 (추적이 힘듦)
     */
    private static void example3_breakInNestedLoops_labeled() {
        System.out.println("[3] break in nested loops (labeled break)");

        int stopRow = 2;
        int stopCol = 3;

        OUTER: for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("(" + row + "," + col + ") ");

                if (row == stopRow && col == stopCol) {
                    System.out.println(" -> break OUTER");
                    break OUTER;
                }
            }
            System.out.println();
        }
    }

    /**
     * 실무에서는 labeled break보다 "메서드 분리 + return"이 더 읽기 쉬운 경우가 많다.
     */
    private static void example4_breakVsReturn() {
        System.out.println("[4] labeled break vs return (readability)");

        boolean ok = containsPairSum(new int[] { 1, 3, 5, 7 }, 10);
        System.out.println("contains pair sum=10 ? " + ok);
    }

    private static boolean containsPairSum(int[] nums, int sum) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == sum) {
                    return true; // 이 시점에서 메서드 자체를 종료 -> 중첩 루프 탈출이 명확
                }
            }
        }
        return false;
    }
}
