package basic.exam;

import java.util.Scanner;

public class 문제12 {
    public static void main(String[] args) {
        // 문제 12. 알람시계문제
        //
        //- 문제
        //- 예제입력
        //10 10
        //0 30
        //23 40
        //1 20
        //
        //- 예제출력
        //9 25
        //23 45
        //22 55
        //0 35

        int hour;
        int min;

        System.out.println("상근아! 몇시에 일어나레?");

        System.out.println("H: ");
        Scanner scanner = new Scanner(System.in);

        do {
            hour = scanner.nextInt();
        } while (hour < 0 || hour >= 24);

        System.out.println("M: ");
        do {
            min = scanner.nextInt();
        } while (min < 0 || min >= 60);

        calculate_time(hour, min);
    }

    static void calculate_time(int h, int m) {
        m = m - 45;
        if (m < 0) {
            m = m + 60;
            h--;
            if (h < 0) {
                h = h + 24;
            }
        }

        System.out.println(h + "시 " + m + "분 에 깨우겠습니다.");
    }
}
