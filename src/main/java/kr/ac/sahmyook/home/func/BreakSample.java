package kr.ac.sahmyook.home.func;

public class BreakSample {
    public void sumBreak(){         //  1~100까지 정수들의 합계 출력
       int i = 1;
       int sum = 0;

       while (true) {
           sum += i;
           i++;
           if (i > 100) break;
       }
        System.out.println("1 ~ 100까지 정수들의 합계는 " + sum + "입니다.");
    }

    public void guguDanBreak(){     // 구구단 1단~9단까지 출력하되, * 5 계산에서 반복문 빠지기
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++){
                if (j != 5) System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
