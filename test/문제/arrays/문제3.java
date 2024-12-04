package basic.arrayTest;

import java.util.Scanner;

public class 문제3 {
    public static void main(String[] args) {
        // 문제 3. 선택(Selection) 정렬
        //
        //- 선택정렬은 매 단계에서 가장 작은 원소를 선택해서 앞으로 보냄
        //- 앞으로 보내진 원소는 더 이상 위치가 변하지 않는다.
        //- 시간복잡도 O(N^2)로 비효율적 정렬 알고리즘 중 하나.
        //
        //※ 동작방식
        //ⓐ 각 단계에서 가장 작은 원소를 선택
        //ⓑ 현재까지 처리되지 않은 원소들 중 가장 앞의 원소와 교체
        //
        //예> 4 1 2 5 3
        //1단계 : 1 4 2 5 3
        //2단계 : 1 2 4 5 3
        //3단계 : 1 2 3 5 4
        //4단계 : 1 2 3 4 5
        //
        //
        //- 입력
        //배열로 4 1 2 5 3 가 주어진다.
        //
        //- 출력
        //위의 예시와 같은 결과 출력.

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

        for (int i = 0; i < numbers.length - 1; i++)
        {
            int smallest_number = numbers[i];
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < smallest_number) smallest_number = numbers[j];
            }

            for (int k = i; k < numbers.length; k++) {
                if (numbers[k] == smallest_number) {
                    int temp = numbers[i];
                    numbers[i] = numbers[k];
                    numbers[k] = temp;
                }
            }

            System.out.printf((i + 1) + "단계: ");
            for (int l = 0; l < numbers.length; l++) {
                System.out.printf(numbers[l] + " ");
            }
            System.out.printf("\n");
        }


    }

}
