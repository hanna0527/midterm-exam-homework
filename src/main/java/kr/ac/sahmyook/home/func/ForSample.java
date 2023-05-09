package kr.ac.sahmyook.home.func;

import java.util.Arrays;
import java.util.Scanner;

public class ForSample {
    Scanner sc = new Scanner(System.in);
    public void sum1To10(){         // 1~10까지 정수들의 합계
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 정수의 합은 " + sum + "입니다.");
    }

    public void sumEven1To100(){    // 1~100 사이의 짝수들의 합게
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1부터 100 사이의 짝수들의 합계는 " + sum + "입니다.");
    }

    public void oneGugudan(){       // 정수 하나 입력, 그 수의 구구단 출력
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }

    public void sumMinToMax(){      // 두 개의 정수 입력, 두 수 중 작은 값에서 큰 값까지의 합계
        int[] numbers = new int[2];
        int sum = 0;

        System.out.print("첫 번째 정수를 입력하세요 : ");
        numbers[0] = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요 : ");
        numbers[1] = sc.nextInt();

        Arrays.sort(numbers);

        for (int i = numbers[0]; i <= numbers[1]; i++) {
            sum += i;
        }
        System.out.println(numbers[0] + "에서 " + numbers[1] + "까지의 합계는 " + sum + "입니다.");
    }

    public void printStar(){        // 줄 수와 칸 수 입력, 입력된 줄 수/칸 수 만큼 별표 문자 출력
        System.out.print("줄 수를 입력하세요 : ");
        int col = sc.nextInt();

        System.out.print("칸 수를 입력하세요 : ");
        int row = sc.nextInt();

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printNumberStar(){          // 7줄에 7칸에 별표 문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(i + 1);    // 1부터 7까지
            }
            System.out.println();
        }
    }

    public void printTriangleStar(){ // 줄 수를 입력, 삼각형 모양 별표 문자 출력 (양수:직각 삼각형, 음수:역삼각형)
        System.out.print("줄 수를 입력하세요 : ");
        int col = sc.nextInt();

        if (col > 0) {
            for (int i = 0; i < col; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (col < 0) {
            col = Math.abs(col);

            for (int i = 0; i < col; i++) {
                for (int k = col - i; k > 0; k--) {    // 별
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

    public void guguDan(){          // 구구단 2단부터 9단 출력
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j +" = " + (i * j));
            }
            System.out.println();
        }
    }

}
