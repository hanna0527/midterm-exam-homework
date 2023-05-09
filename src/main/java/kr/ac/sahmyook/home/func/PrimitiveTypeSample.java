package kr.ac.sahmyook.home.func;

public class PrimitiveTypeSample {
    public void typeSize(){     // 기본 자료형 메모리 크기(byte) 출력
        System.out.println("------------------------------------------------------------------------");
        System.out.println("*** 기본 자료형 8가지 메모리 크기 정리 ***");
        System.out.println("** 정수형 **");
        System.out.println("byte    1 Byte");
        System.out.println("short   2 Byte");
        System.out.println("int     4 Byte");
        System.out.println("long    8 Byte");
        System.out.println();

        System.out.println("** 실수형 **");
        System.out.println("float   4 Byte");
        System.out.println("double  8 Byte");
        System.out.println();

        System.out.println("** 문자형 **");
        System.out.println("char    2 Byte");
        System.out.println();

        System.out.println("** 논리형 **");
        System.out.println("boolean 1 Byte");
        System.out.println("------------------------------------------------------------------------");
    }
}
