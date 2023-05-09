package kr.ac.sahmyook.home.func;

import java.util.Arrays;
import java.util.Scanner;

public class IfSample {
    Scanner sc = new Scanner(System.in);

    public void maxNumber(){        // 두 수 중 큰 수
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.print("두 수 중 더 큰 수는 ");

        if (num1 > num2) {
            System.out.print(num1);
        } else {
            System.out.print(num2);
        }

        System.out.println(" 입니다.");
    }

    public void minNumber(){         // 두 수 중 작은 값
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.print("두 수 중 더 작은 수는 ");

        if (num1 < num2) {
            System.out.print(num1);
        } else {
            System.out.print(num2);
        }

        System.out.println(" 입니다.");
    }

    public void threeMaxMin(){          // 세 수 중 가장 큰 수와 작은 수
        int[] number = new int[3];

        System.out.print("첫 번째 정수를 입력하세요 : ");
        number[0] = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요 : ");
        number[1] = sc.nextInt();

        System.out.print("세 번째 정수를 입력하세요 : ");
        number[2] = sc.nextInt();

        Arrays.sort(number);
        System.out.print("세 수 중 가장 작은 수는 " + number[0] + "이고, ");
        System.out.println("가장 큰 수는 " + number[2] + " 입니다.");
    }

    public void checkEven(){            // 짝홀 확인
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        System.out.println("입력하신 정수는 " + (num % 2 == 0 ? "짝수" : "홀수") + "입니다.");
    }

    public void isPassFail(){           // 국영수 점수로 pass/fail
        System.out.print("국어 점수를 입력해주세요 : ");
        int kor = sc.nextInt();

        System.out.print("영어 점수를 입력해주세요 : ");
        int eng = sc.nextInt();

        System.out.print("수학 점수를 입력해주세요 : ");
        int math = sc.nextInt();

        int avg = (kor + eng + math) / 3;

        System.out.print("평균의 합격 기준 점수를 입력해주세요 : ");
        int passAvg = sc.nextInt();

        System.out.print("각각 과목의 합격 기준 점수를 입력해주세요 : ");
        int passEach = sc.nextInt();

        /* 합격 평균 점수보다 크거나 같고, 각각의 과목의 점수가 합격 기준을 만족한다면 */
        if (avg >= passAvg && (kor >= passEach && eng >= passEach && math >= passEach)) {
            System.out.println("합격입니다!");
        } else {                    // 불합격 요인 출력
            if (avg < passAvg) {    // 평균 점수 미달
                System.out.println("평균 점수 미달로 불합격입니다.");
            }

            if (kor < passEach) {   // 국어 점수 미달
                System.out.println("국어 점수 미달로 불합격입니다.");
            }

            if (eng < passEach) {   // 영어 점수 미달
                System.out.println("영어 점수 미달로 불합격입니다.");
            }

            if (math < passEach) {   // 수학 점수 미달
                System.out.println("수학 점수 미달로 불합격입니다.");
            }
        }
    }

    public void scoreGrade(){           // 점수로 학점 출력
        int score;
        System.out.print("점수를 입력해주세요 : ");
        score = sc.nextInt();

        System.out.print("당신의 학점은 ");

        if (score >= 90) System.out.print("A");
        else if (score >= 80) System.out.print("B");
        else if (score >= 70) System.out.print("C");
        else if (score >= 60) System.out.print("D");
        else System.out.print("F");

        System.out.println("입니다.");
    }

    public void checkPlusMinusZero(){   // 입력 정수로 양수, 0, 음수 판별
        System.out.print("정수를 입력해주세요 : ");
        int num = sc.nextInt();

        System.out.print("입력하신 정수는 ");

        if (num == 0) System.out.print("0");
        else System.out.print(num > 0 ? "양수" : "음수");

        System.out.println("입니다.");
    }

    public void whatCaracter(){         // 입력 문자로 영 대문자, 영 소문자, 숫자, 기타문자 판별
        System.out.print("하나의 문자를 입력해주세요 : ");
        char c = sc.nextLine().charAt(0);

        System.out.print("입력하신 문자는 ");
        if (Character.isDigit(c)) System.out.print("숫자");
        else if (c >= 'a' && c <= 'z') System.out.print("영어 소문자");
        else if (c >= 'A' && c <= 'Z') System.out.print("영어 대문자");
        else System.out.print("기타 문자");

        System.out.println("입니다.");
    }
}
