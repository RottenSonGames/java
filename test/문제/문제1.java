package basic.exam;

public class 문제1 {
    public static void main(String[] args) {
        // 문제1. 1부터 10까지의 수를 출력하세요. (단, 숫자가 6일 때는 출력하지 마세요)
        //      for와 while 문 두 문법을 사용해서 만드세요.

        for (int i = 1; i <= 10; i++) {
            if (i == 6) continue;
            System.out.println("i = " + i);
        }

        int i = 1;
        while (i <= 10) {
            if (i == 6) i++;
            System.out.println("i = " + i);
            i++;
        }
    }
}
