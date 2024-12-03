package basic.exam;

import java.util.Scanner;

public class 문제14 {
    public static void main(String[] args) {
        // - 문제
        //1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라
        //상금을 받는 게임이 있다.
        //
        //ⓐ 같은 눈이 3개가 나오면
        //    -- 상금 : 10,000원 + (같은 눈) × 1,000원
        //ⓑ 같은 눈이 2개만 나오는 경우에는
        //    -- 상금 : 1,000원 + (같은 눈) × 100원
        //ⓒ 모두 다른 눈이 나오는 경우에는
        //    -- 상금 : (그 중 가장 큰 눈) × 100원

        //- 예제입력
        //3 3 6
        //
        //2 2 2
        //
        //6 2 5
        //
        //- 예제출력
        //1300
        //
        //12000
        //
        //600

        int d1 = 0;
        int d2 = 0;
        int d3 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("주사위 1 은 눈 몃게 보여요?");
        d1 = scanner.nextInt();

        System.out.println("주사위 2 은 눈 몃게 보여요?");
        d2 = scanner.nextInt();

        System.out.println("주사위 3 은 눈 몃게 보여요?");
        d3 = scanner.nextInt();

        compare_die(d1, d2, d3);
    }

    static void compare_die(int d1, int d2, int d3) {
        int prize;

        if (d1 == d2 && d1 == d3) {
            prize = 10000;
        }

        else if (d1 == d2 || d1 == d3 || d2 == d3) {
            prize = 1000;
            if (d2 == d3) {
                d1 = d2;
            }
        }

        else {
            prize = 0;
            if (d1 < d2) {
                d1 = d2;
            }
            if (d1 < d3) {
                d1 = d3;
            }
        }

        calculate_prize(prize, d1);
    }

    static void calculate_prize(int p, int d) {
        int total;

        if (p != 0) {
            total = p + d * (p / 10);
        }

        else {
            total = d * 100;
        }
        System.out.print("축하합니다! " + total + " 당첨되셨습니다!");
    }
}
