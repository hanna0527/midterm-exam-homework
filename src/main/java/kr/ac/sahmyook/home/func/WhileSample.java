package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class WhileSample {

    Scanner sc = new Scanner(System.in);
    public void printUniCode() {     // 문자 하나 입력, 문자의 유니코드 출력 반복 ('0' 입력되면 반복 종료)
        char c = ' ';
        sc.nextLine();

        while (c != '0') {
            System.out.print("문자 하나를 입력해주세요 : ");
            c = sc.nextLine().charAt(0);
            System.out.println(c + "의 유니코드는 " + ((int) c) + "입니다.");
        }
    }

    public void sum1To100(){        // 1~100까지 정수들의 합계 출력
        int i = 0;
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("1 ~ 100까지의 정수의 합은 " + sum + "입니다.");
    }

    public void numberGame(){       // 1~100 사이의 임의의 정수를 발생시켜, 숫자 알아맞추기
        int rand = (int)((Math.random() * 100) + 1);
        int guess;
        int count = 0;
        while (true) {
            count++;
            System.out.print("정수를 입력하세요 : ");
            guess = sc.nextInt();

            if (rand == guess) {
                System.out.println("정답입니다! " + count + "회에 맞추셨습니다!");
                return;
            }
            else if (rand > guess) System.out.println("입력하신 정수보다 큽니다.");
            else System.out.println("입력하신 정수보다 작습니다.");

        }
    }

    public void countCharacter(){   // 문자열을 입력받아, 글자 갯수 알아내어 출력
        System.out.print("문자열을 입력해주세요 : ");
        String str = sc.nextLine();

        System.out.println("입력하신 문자열의 길이는 " + str.length() + "입니다.");
    }

    public void countInChar(){      // 문자열 값과 문자 하나를 입력, 문자열에 문자가 몇 개 있는지 확인
        System.out.print("문자열을 입력해주세요 : ");
        String str = sc.nextLine();

        System.out.print("문자를 하나 입력해주세요 : ");
        char word = sc.nextLine().charAt(0);

        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == word) count++;
        }
        System.out.println("문자열에 " + word + "은(는) " + count + "개 있습니다.");
    }
}
