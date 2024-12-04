package basic.arrayTest;

import java.util.Scanner;

public class 문제5 {
    public static void main(String[] args) {
        // 문제 5. 삽입정렬(Insertion)
        //
        //- 각 숫자를 적절한 위치에 삽입하는 정렬 기법
        //- 시간복잡도 O(N^2)로 비효율적 정렬 알고리즘 중 하나.
        //
        //※ 동작방식
        //ⓐ 각 단계에서 현재 원소가 삽입될 위치를 찾는다.
        //ⓑ 적절한 위치에 도달할 때까지 반복적으로 왼쪽으로 이동한다.
        //ⓒ 두번째 원소부터 비교하여 앞으로 이동시킨다.
        //
        //※ 삽입, 버블정렬에 비해 빠르다. 거의 정렬되어 있는 구조는 더 빠르다.
        //예> 9 8 2 4 3
        //1단계 : 8 9 2 4 3
        //2단계 : 2 8 9 4 3
        //3단계 : 2 4 8 9 3
        //4단계 : 2 3 4 8 9

        Scanner sc = new Scanner(System.in);

        System.out.println("처리 하고 싶은 숫자 입력 하세용~");
        String input = sc.nextLine();
        String[] inputNumbers = input.split("\\s+");

        int[] numbers = new int[inputNumbers.length];
        int inputIndex = 0;

        for (String inputNumber : inputNumbers) {
            numbers[inputIndex] = Integer.parseInt(inputNumber);
            inputIndex++;
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            int index = i + 1;
            for (int j = 0; j <= i; j++) {
                if (numbers[i + 1] < numbers[i - j]) {
                    index = i - j;
                }
            }

            numbers[i + 1] = numbers[index];
            fpr (int k = )

            System.out.printf((i + 1) + "단계: ");
            for (int l = 0; l < numbers.length; l++) {
                System.out.printf(numbers[l] + " ");
            }
            System.out.printf("\n");

        }
    }
}
