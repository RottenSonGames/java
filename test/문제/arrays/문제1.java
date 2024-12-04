package basic.arrayTest;

public class 문제1 {
    public static void main(String[] args) {
        // 문제 1. 최댓값과 인덱스찾기
        //
        //9개의 서로 다른 자연수
        //3, 29, 38, 12, 57, 74, 40, 85, 61
        //가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째
        //수인지를 구하는 프로그램을 작성하시오.
        //
        //이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
        //
        //출력 :
        //
        //최댓값 : 85
        //인덱스 : 7

        int[] array = {3, 29, 38, 12, 57, 74, 40, 85, 61};

        int n = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                n = array[i];
                index = i;
            }
        }

        System.out.println("최댓값 : " + n + "\n인덱스 : " + index);
    }

}
