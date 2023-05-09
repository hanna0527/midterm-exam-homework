package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {
    Scanner sc = new Scanner(System.in);

    public void myProfile(){        // 내 신상정보 변수에 담아 출력하기
        String name = "홍길동";
        int age = 25;
        boolean isGraduated = false;

        System.out.println("------------------------------------------------------------------------");
        System.out.println("*** 변수에 담은 신상정보 ***");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("졸업 여부 : " + isGraduated);
        System.out.println("------------------------------------------------------------------------");
    }

    public void empInformation(){   // 사원정보를 키보드로 입력받아 출력하기
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.print("직책을 입력하세요 : ");
        sc.nextLine();
        String position = sc.nextLine();

        System.out.println("------------------------------------------------------------------------");
        System.out.println("*** 사원 정보 ***");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("직책 : " + position);
        System.out.println("------------------------------------------------------------------------");
    }
}
