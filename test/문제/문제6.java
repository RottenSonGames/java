package basic.exam;

import java.util.Scanner;

public class 문제6 {
    public static void main(String[] args) {
        // 문제6. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        //- 입력(intA, intB) (A > 0, B < 10)
        //
        //- 예제 입력(input_1.txt)
        //7 9
        //
        //- 출력
        //첫째 줄에 A+B를 출력한다.
        //
        //7 + 9 = 16

        Scanner scanner = new Scanner(System.in);

        System.out.println("a는 > 0: ");
        int a = get_number(scanner);
        while (a <= 0)
        {
            System.out.println("a는 > 0, 이 바보야!");
            a = get_number(scanner);
        }

        System.out.println("b는 < 10: ");
        int b = get_number(scanner);
        while (b >= 10)
        {
            System.out.println("b는 < 10, 이 바보야!");
            b = get_number(scanner);
        }

        System.out.println(a + " + " + b + " = " + (a + b));

        scanner.close();

    }

    public static int get_number(Scanner scansturbator) {
        return scansturbator.nextInt();
    }
}
