package kr.ac.sahmyook.home.func;

public class StaticMethodSample {
    public void testMathRandom(){   // Math 클래스의 랜덤값 구하는 메소드 : 1~45 사이의 임의의 정수 출력
        int rand = (int)((Math.random() * 45) + 1);
        System.out.println("1 ~ 45 중 랜덤한 정수는 " + rand + "가 나왔습니다.");
    }

    public void testMathAbs(){      // Math 클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력
        System.out.println("-12.77의 절댓값은 " + Math.abs(-12.77) + "입니다.");
    }

    public void testMathMax(){      // Math 클래스의 두 정수 중 큰 값 구하는 메소드 : 120, 54 중 큰값 출력
        System.out.println("120과 54 중 더 큰 값은 " + Math.max(120, 54) + "입니다.");
    }
}
