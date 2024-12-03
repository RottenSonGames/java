package basic.exam;

import java.util.Scanner;

public class 문제9 {
    public static void main(String[] args) {
        // 문제 9. 별찍기
        //
        //- 문제
        //첫째 줄에는 별 5개, 둘째 줄에는 별 4개 .... 마지막 1개
        //
        //- 예제입력
        //5
        //
        //- 예제출력
        //*****
        //****
        //***
        //**
        //*

        Scanner scanner = new Scanner(System.in);

        System.out.println("별 몃줄 원해요? ");
        int rowNumber = scanner.nextInt();

        for (int i = 1; i <= rowNumber; i++) {
            for (int j = rowNumber; j >= i; j--) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
