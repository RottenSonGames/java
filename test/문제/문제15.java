package basic.exam;

import java.util.Scanner;

public class 문제15 {
    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("메뉴를 선택하세요");
        System.out.println("======================");
        System.out.println("1. 인사하기 2. 춤추기 3. 밥먹기  4. 종료하기");

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            option = scanner.nextInt();
            print_message(option);
        } while (option != 4);

        System.out.println("프로그램을 종료합니다.");

    }

    static void print_message(int opt) {
        switch (opt) {
            case 1:
                System.out.println("안녕하세요~");
                break;
            case 2:
                System.out.println("삐끼삐끼 춤입니다.");
                break;
            case 3:
                System.out.println("맛나게 먹었습니다.");
                break;
            default:
                System.out.println("재데로 입력합시다. ㅇㅋ?!");
        }

        System.out.println("1. 인사하기 2. 춤추기 3. 밥먹기  4. 종료하기");
    }
}
