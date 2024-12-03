package basic.exam;

import java.util.Scanner;

public class 문제4 {
    public static void main(String[] args) {
        // 문제4. 임의의 값 n이 주어지면
        //   예를들어 n=5이면
        //   1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)
        //   의 결과를 출력하세요.

        Scanner scanner = new Scanner(System.in);
        System.out.println("원하는 값을 입력 하세요: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1) System.out.print(j);
                else {
                    if (j == 1) System.out.print("(" + j + " + ");
                    else if (j == i) System.out.print(j + ")");
                    else System.out.print(j + " + ");
                }
                sum += j;
            }
            if (i < n) System.out.print(" + ");
        }

        System.out.println(" = " + sum);

        scanner.close();
    }

}
