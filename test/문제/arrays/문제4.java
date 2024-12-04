package basic.arrayTest;

import java.util.Scanner;

public class 문제4 {
    public static void main(String[] args) {
        // 문제 4. 버블정렬
        //
        //- 인접한 두 원소를 비교하여, 정렬이 안되어 있으면 위치를 서로 변경
        //- 시간복잡도 O(N^2)로 비효율적 정렬 알고리즘 중 하나.
        //
        //※ 동작방식
        //ⓐ 각 단계에서 인접한 두 개의 원소를 비교하여 큰 값을 뒤로 보냄.
        //ⓑ 매 회차마다 가장 큰 원소가 맨 뒤로 이동된다.
        //
        //예> 9 8 2 4 3
        //1단계 : 8 2 4 3 9
        //2단계 : 2 4 3 8 9
        //3단계 : 2 3 4 8 9
        //4단계 : 2 3 4 8 9

        Scanner sc = new Scanner(System.in);

        System.out.println("처리 하고 싶은 숫자 입력 하세용~");
        String input = sc.nextLine();
        String[] inputNumbers = input.split("\\s+");

        int[] numbers = new int[inputNumbers.length];
        int index = 0;
        for (String inputNumber : inputNumbers) {
            numbers[index] = Integer.parseInt(inputNumber);
            index++;
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j + 1] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            System.out.printf((i + 1) + "단계: ");
            for (int k = 0; k < numbers.length; k++) {
                System.out.printf(numbers[k] + " ");
            }
            System.out.printf("\n");
        }


    }
}
