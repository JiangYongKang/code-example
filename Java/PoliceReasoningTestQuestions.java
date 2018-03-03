package com.person.vincent;

import java.util.Arrays;

/**
 * Author: vincent
 * Date: 2018-03-02 21:59:00
 * Comment: 刑警推理试题 Java 实现
 * 1. 这道题的答案是：
 *     A.A    B.B    C.C    D.D
 *
 * 2. 第5题的答案是：
 *     A.C    B.D    C.A    D.B
 *
 * 3. 以下选项中哪一题的答案与其它三项不同：
 *     A.第3题    B.第6题    C.第2题    D.第4题
 *
 * 4. 以下选项中哪两题的答案相同：
 *     A.第1，5题    B.第2，7题    C.第1，9题    D.第6，10题
 *
 * 5. 以下选项中哪一题的答案与本题相同：
 *     A.第8题    B.第4题    C.第9题    D.第7题
 *
 * 6. 以下选项中哪两题的答案与第8题相同：
 *     A.第2，4题    B.第1，6题    C.第3，10题    D.第5，9题
 *
 * 7. 在此十道题中，被选中次数最少的选项字母为：
 *     A.C    B.B    C.A    D.D
 *
 * 8. 以下选项中哪一题的答案与第1题的答案在字母中不相邻：
 *     A.第7题    B.第5题    C.第2题    D.第10题
 *
 * 9. 已知 “第1题与第6题的答案相同” 与 “第X题与第5题的答案相同” 的真假性为反，那么X为：
 *     A.第6题    B.第10题    C.第2题    D.第9题
 *
 * 10. 在此10道题中，ABCD四个字母出现次数最多与最少者的差为：
 *     A.3    B.2    C.4    D.1
 */
public class PoliceReasoningTestQuestions {

    private static final int[][] TOTAL_ANSWER = {
            {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4},
            {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4},
    };

    private static int[] SEED = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    private static final int TOTAL_COUNT = Double.valueOf(
            Math.pow(TOTAL_ANSWER[0].length, TOTAL_ANSWER.length)
    ).intValue();

    private static void accumulator(int[] seed) {
        for (int i = seed.length - 1; i >= 0; i--) {
            if (seed[i] + 1 <= 3) {
                seed[i] = seed[i] + 1;
                break;
            } else {
                seed[i] = 0;
            }
        }
    }

    private static long max(long[] optionCount) {
        long max = Long.MIN_VALUE;
        for (long anOptionCount : optionCount) {
            if (anOptionCount > max)
                max = anOptionCount;
        }
        return max;
    }

    private static long min(long[] optionCount) {
        long min = Long.MAX_VALUE;
        for (long anOptionCount : optionCount) {
            if (anOptionCount < min)
                min = anOptionCount;
        }
        return min;
    }

    private static boolean secondQuestion(int[] answers) {
        return (answers[1] == 1 && answers[4] == 3)
                || (answers[1] == 2 && answers[4] == 4)
                || (answers[1] == 3 && answers[4] == 1)
                || (answers[1] == 4 && answers[4] == 2);

    }

    private static boolean thirdQuestion(int[] answers) {
        return (answers[2] == 1 && answers[2] != answers[5] && answers[2] != answers[1] && answers[2] != answers[3])
                || (answers[2] == 2 && answers[5] != answers[2] && answers[5] != answers[1] && answers[5] != answers[3])
                || (answers[2] == 3 && answers[1] != answers[2] && answers[1] != answers[5] && answers[1] != answers[3])
                || (answers[2] == 4 && answers[3] != answers[2] && answers[3] != answers[5] && answers[3] != answers[1]);

    }

    private static boolean fourthQuestion(int[] answers) {
        return (answers[3] == 1 && answers[0] == answers[4])
                || (answers[3] == 2 && answers[1] == answers[6])
                || (answers[3] == 3 && answers[0] == answers[8])
                || (answers[3] == 4 && answers[5] == answers[9]);
    }

    private static boolean fifthQuestion(int[] answers) {
        return (answers[4] == 1 && answers[4] == answers[7])
                || (answers[4] == 2 && answers[4] == answers[3])
                || (answers[4] == 3 && answers[4] == answers[8])
                || (answers[4] == 4 && answers[4] == answers[6]);
    }

    private static boolean sixthQuestion(int[] answers) {
        return (answers[5] == 1 && answers[7] == answers[1] && answers[7] == answers[3])
                || (answers[5] == 2 && answers[7] == answers[0] && answers[7] == answers[5])
                || (answers[5] == 3 && answers[7] == answers[2] && answers[7] == answers[9])
                || (answers[5] == 4 && answers[7] == answers[4] && answers[7] == answers[8]);
    }

    private static boolean seventhQuestion(int[] answers) {
        long a = Arrays.stream(answers).filter(x -> x == 1).count();
        long b = Arrays.stream(answers).filter(x -> x == 2).count();
        long c = Arrays.stream(answers).filter(x -> x == 3).count();
        long d = Arrays.stream(answers).filter(x -> x == 4).count();

        return (answers[6] == 1 && c == min(new long[]{a, b, c, d}))
                || (answers[6] == 2 && b == min(new long[]{a, b, c, d}))
                || (answers[6] == 3 && a == min(new long[]{a, b, c, d}))
                || (answers[6] == 4 && d == min(new long[]{a, b, c, d}));
    }

    private static boolean eighthQuestion(int[] answers) {
        return (answers[7] == 1 && answers[0] + 1 != answers[6] && answers[0] - 1 != answers[6])
                || (answers[7] == 2 && answers[0] + 1 != answers[4] && answers[0] - 1 != answers[4])
                || (answers[7] == 3 && answers[0] + 1 != answers[1] && answers[0] - 1 != answers[1])
                || (answers[7] == 4 && answers[0] + 1 != answers[9] && answers[0] - 1 != answers[9]);
    }

    private static boolean ninthQuestion(int[] answers) {
        return (answers[8] == 1 && (answers[0] == answers[5]) == (answers[4] != answers[5]))
                || (answers[8] == 2 && (answers[0] == answers[5]) == (answers[4] != answers[9]))
                || (answers[8] == 3 && (answers[0] == answers[5]) == (answers[4] != answers[1]))
                || (answers[8] == 4 && (answers[0] == answers[5]) == (answers[4] != answers[8]));
    }

    private static boolean tenthQuestion(int[] answers) {
        long a = Arrays.stream(answers).filter(x -> x == 1).count();
        long b = Arrays.stream(answers).filter(x -> x == 2).count();
        long c = Arrays.stream(answers).filter(x -> x == 3).count();
        long d = Arrays.stream(answers).filter(x -> x == 4).count();

        long min = min(new long[]{a, b, c, d});
        long max = max(new long[]{a, b, c, d});

        return (answers[9] == 1 && max - min == 3)
                || (answers[9] == 2 && max - min == 2)
                || (answers[9] == 3 && max - min == 4)
                || (answers[9] == 4 && max - min == 1);
    }

    private static void display(int[] answers) {
        for (int answer : answers) {
            switch (answer) {
                case 1:
                    System.out.print("A ");
                    break;
                case 2:
                    System.out.print("B ");
                    break;
                case 3:
                    System.out.print("C ");
                    break;
                case 4:
                    System.out.print("D ");
                    break;
                default:
                    System.out.println("what?!!!");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[][] answers = new int[TOTAL_COUNT][10];

        for (int i = 0; i < TOTAL_COUNT; i++) {
            int[] answer = new int[10];
            for (int k = 0; k < TOTAL_ANSWER.length; k++) {
                answer[k] = TOTAL_ANSWER[k][SEED[k]];
            }
            answers[i] = answer;
            PoliceReasoningTestQuestions.accumulator(SEED);
        }

        for (int[] answer : answers) {
            if (secondQuestion(answer) && thirdQuestion(answer) && fourthQuestion(answer)
                    && fifthQuestion(answer) && sixthQuestion(answer) && seventhQuestion(answer)
                    && eighthQuestion(answer) && ninthQuestion(answer) && tenthQuestion(answer)) {
                System.out.println("最终结果：");
                display(answer);
                break;
            }
        }
    }
}
