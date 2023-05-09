package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class SwitchSample {
    Scanner sc = new Scanner(System.in);
    public void calculator(){   // 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        long num1 = sc.nextInt();       // 오버플로우 방지 (자동 형변환으로 long 계산값)

        System.out.print("두 번째 정수를 입력해주세요 : ");
        int num2 = sc.nextInt();

        System.out.print("한 개의 연산문자(+, -, *, /, %)를 입력해주세요 : ");
        sc.nextLine();
        char operator = sc.nextLine().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;

            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;

            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;

            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;

            case '%':
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                break;

            default:
                System.out.println("없는 연산문자입니다!");
        }
    }

    public void fruitPrice(){   // 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기
        System.out.print("과일 이름을 입력해주세요 (바나나, 사과, 토마토, 키위) : ");
        String fruitName = sc.nextLine();

        System.out.print(fruitName + "는(은) ");

        switch (fruitName) {
            case "바나나":
                System.out.println("2000원입니다.");
                break;

            case "사과":
                System.out.println("1000원입니다.");
                break;

            case "토마토":
                System.out.println("1500원입니다.");
                break;

            case "키위":
                System.out.println("1600원입니다.");
                break;

            default:
                System.out.println("목록에 없는 과일입니다!");
        }
    }
}
