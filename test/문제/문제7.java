package basic.exam;

import java.util.Scanner;

public class 문제7 {
    public static void main(String[] args) {
        // 문제7. 두 정수 A와 B를 입력받은 다음, 두 수 A와 B 사이의 모든 정수값을 더해
        // 출력하는 프로그램을 작성하시오.
        //
        //- 입력(intA, intB) (A > 0, B < 10)
        //
        //- 예제 입력 1(input_2.txt)
        //2 7
        //
        //- 예제 입력 1(input_2.txt)
        //7 2
        //
        //- 출력
        //27

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

        scanner.close();

        System.out.println(get_sum_of_ints_in_between(a, b));

    }

    public static int get_number(Scanner scansturbator) {
        return scansturbator.nextInt();
    }

    static int get_sum_of_ints_in_between(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;
    }


}
