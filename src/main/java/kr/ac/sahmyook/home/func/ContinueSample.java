package kr.ac.sahmyook.home.func;

public class ContinueSample {
    public void sumJumpThree(){     // 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            sum += i;
            i++;
        }
            System.out.println("1 ~ 100까지의 정수 중 3의 배수를 뺀 정수의 합은 " + sum + "입니다.");
    }
    public void rowColJump(){       // 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++){
                if (i == 0 && j > 1) continue;
                System.out.print((i + 1) + "행 " + (j + 1) + "열|");
            }
            System.out.println();
        }
    }
}
