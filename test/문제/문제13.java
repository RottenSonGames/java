package basic.exam;

import java.util.Scanner;

public class 문제13 {
    public static void main(String[] args) {
        // - 문제
        //KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을
        //개발하려고 한다.
        //- 예제입력
        //14 30
        //20
        //
        //17 40
        //80
        //
        //23 48
        //25
        //
        //- 예제출력
        //14 50
        //
        //19 0
        //
        //0 13

        int hour;
        int min;
        int time;

        System.out.println("현제 시간은?");

        System.out.println("H: ");
        Scanner scanner = new Scanner(System.in);

        do {
            hour = scanner.nextInt();
        } while (hour < 0 || hour >= 24);

        System.out.println("M: ");
        do {
            min = scanner.nextInt();
        } while (min < 0 || min >= 60);

        System.out.println("몇분 동안 돌려요");
        do {
            time = scanner.nextInt();
        } while (time < 0 || time > 1000);

        calculate_time(hour, min, time);
    }

    static void calculate_time(int h, int m, int t) {
        int tHour = t / 60;
        int tMin = t % 60;

        m = m + tMin;
        if (m >= 60) {
            m = m - 60;
            h++;
        }

        h = h + tHour;
        if (h >= 24) {
            h = h - 24;
        }


        System.out.println(h + "시 " + m + "분 에 끝나겠습니다.");
    }
}
