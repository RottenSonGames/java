package basic.exam;

import java.util.Scanner;

public class 문제10 {
    public static void main(String[] args) {
        // 문제 10. 입력받은 구구단 출력하기
        //
        //- 문제
        //파일에서 입력받은 수의 구구단 출력.
        //
        //- 입력
        //구하고자 하는 구구단의 수를 입력받는다.
        //N(2 ≤ N ≤ 9)이 주어진다.
        //
        //- 출력
        //차례대로 구구단을 출력한다.
        //
        //- 예제입력(input_8.txt)
        //3
        //
        //- 예제출력
        //3 × 1 = 3
        //3 × 2 = 6
        //3 × 3 = 9
        //3 × 4 = 12
        //....

        System.out.println("구구단을 왜우자! 구구단을 왜우자! 어는 숫자 원해요?");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for (int i = 1; i <= 9; i++) {
            int product = i * n;
            System.out.println(n + " x " + i + " = " + product);
        }
    }
}

