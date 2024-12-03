package basic.exam;

import java.util.Scanner;

public class 문제8 {
    public static void main(String[] args) {
        //문제 8. 별찍기
        //
        //- 문제
        //첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
        //
        //- 예제입력
        //5
        //
        //- 예제출력
        //*
        //**
        //***
        //****
        //*****

        Scanner scanner = new Scanner(System.in);

        System.out.println("별 몃줄 원해요? ");
        int rowNumber = scanner.nextInt();

        for (int i = 1; i <= rowNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
