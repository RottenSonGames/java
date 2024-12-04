package basic.arrayTest;

public class 문제2 {
    public static void main(String[] args) {
        // 문제 2.
        //
        //주사위 두 개를 36,000번 던져서 나오는 모든 경우의 수를 계산하는 프로그램을 작성하세요.
        //주사위 각각은 1부터 6까지의 정수값을 표시할 수 있으므로 합계는 2부터 12까지입니다.
        //
        //- 입력 : 없음.
        //
        //- 출력
        //아래의 모양과 유사하게 출력되도록 합니다.
        //
        //Output :
        //2 : 1026 (0.028500)
        //3 : 2023 (0.056193)
        //4 : 2988 (0.083000)
        //5 : 4086 (0.113500)
        //6 : 5018 (0.139389)
        //7 : 5978 (0.166056)
        //8 : 4928 (0.136889)
        //9 : 3992 (0.110889)
        //10 : 3096 (0.086000)
        //11 : 1907 (0.052972)
        //12 : 958 (0.026611)

        int d1;
        int d2;

        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] results = new int[11];

        int i = 0;
        while (i < 36000) {
            d1 = (int)(Math.random() * 6) + 1;
            d2 = (int)(Math.random() * 6) + 1;
            int sum = d1 + d2;

            compare_sum_and_results(sum, results, values);
            i++;
        }

        print_results(results, values);
    }

    static void compare_sum_and_results(int s, int[] r, int[] v) {
        for (int i = 0; i < v.length; i++) {
                if (s == v[i]) {
                    r[i]++;
                }
            }
    }

    static void print_results(int[] r, int[] v) {
        for (int i = 0; i < r.length; i++) {
            System.out.println(v[i] + " : " + r[i]);
        }
    }
}
