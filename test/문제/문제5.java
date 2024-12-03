package basic.exam;

import java.util.Scanner;

public class 문제5 {
    public static void main(String[] args) {
        // 문제5. money 변수 3780원의 금액이 있습니다.
                // 이를 다음과 같은 결과가 나오도록 출력합니다.

        Scanner scanner = new Scanner(System.in);
        System.out.println("금액 얼마 인가요: ");

        int divider = 0;
        int money = scanner.nextInt();

        while (money > 0) {
            if (money >= 50000) {
                divider = 50000;
            }

            else if (money >= 10000) {
                divider = 10000;
            }

            else if (money >= 1000) {
                divider = 1000;
            }

            else if (money >= 500) {
                divider = 500;
            }

            else if (money >= 100) {
                divider = 100;
            }

            else {
                divider = 10;
            }

            int quotient = money / divider;
            money = money % divider;

            System.out.println(divider + "원: " + quotient + "개");
            System.out.println("남은금액: " + money);
        }
    }
}
