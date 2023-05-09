package kr.ac.sahmyook.home.func;

import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {
    public void testScanner(){  // Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("정수형 byte 입력 : ");
        byte bnum = sc.nextByte();

        System.out.print("정수형 short 입력 : ");
        short snum = sc.nextShort();

        System.out.print("정수형 int 입력 : ");
        int inum = sc.nextInt();

        System.out.print("정수형 long 입력 : ");
        long lnum = sc.nextLong();

        System.out.print("실수형 float 입력 : ");
        float fnum = sc.nextFloat();

        System.out.print("실수형 double 입력 : ");
        double dnum = sc.nextDouble();

        sc.nextLine();
        System.out.print("문자형 char 입력 : ");
        char cnum = sc.nextLine().charAt(0);    // char를 입력받는 함수는 따로 없음

        System.out.print("논리형 boolean 입력 : ");
        boolean boolnum = sc.nextBoolean();

        System.out.println("입력하신 byte 값은 " + bnum + "입니다.");
        System.out.println("입력하신 short 값은 " + snum + "입니다.");
        System.out.println("입력하신 int 값은 " + inum + "입니다.");
        System.out.println("입력하신 long 값은 " + lnum + "입니다.");
        System.out.println("입력하신 float 값은 " + fnum + "입니다.");
        System.out.println("입력하신 double 값은 " + dnum + "입니다.");
        System.out.println("입력하신 char 값은 " + cnum + "입니다.");
        System.out.println("입력하신 boolean 값은 " + boolnum + "입니다.");
    }

    public void testRandom(){   // Random 클래스 사용 : 정수와 실수에 대한 난수 출력
        Random rand = new Random();
        System.out.println("정수 난수 : " + rand.nextInt());
        System.out.println("실수 난수 : " + rand.nextDouble());
    }
}
