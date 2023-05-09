package kr.ac.sahmyook.home.func;


import java.util.LinkedHashMap;
import java.util.Scanner;

public class DoWhileSample {
    Scanner sc = new Scanner(System.in);
    public void addDashToken(){     // 문자열 값 입력받아, 문자 사이에 '-' 끼워넣어 출력
        System.out.print("문자열을 입력해주세요 : ");
        String str = sc.nextLine();

        int i = 0;

        do {
            System.out.print(str.charAt(i));
            if (i  != str.length() -1) {
                System.out.print('-');
            }
            i++;
        } while (i < str.length());

        System.out.println();
    }

    public void burgerKingMenu(){   // 버거킹 메뉴 출력하고 반복적으로 메뉴를 선택 받아 최종적으로 선택한 메뉴들과 총 가격 출력
        LinkedHashMap<String, Integer> order = new LinkedHashMap<>();             // 주문한 버거 수량 (주문 순서에 맞추기 위해 Linked 사용)
        LinkedHashMap<String, Integer> menu = new LinkedHashMap<>();               // 메뉴판(전체) 햄버거 이름과 가격 (hashmap의 순서 유지를 위해 Linked 사용)

        int sum = 0;
        int menuNum;

        menu.put("와퍼", 7100);
        menu.put("불고기 와퍼", 7100);
        menu.put("치즈 와퍼", 7700);
        menu.put("와퍼 주니어", 4700);
        menu.put("불고기 와퍼 주니어", 4700);
        menu.put("치즈 와퍼 주니어", 5000);

        String[] burgerName = menu.keySet().toArray(new String[0]);   // hashmap에 들어있는 버거 이름을 Array로 정리 (0 ~ 5)

        do {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("*** 버거킹 메뉴 ***");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + burgerName[i] + " " + menu.get(burgerName[i]) + "원"); // 메뉴 출력
            }
            System.out.println("0. 주문 종료");
            System.out.println("------------------------------------------------------------------------");

            System.out.print("주문할 버거의 번호를 적어주세요 : ");
            menuNum = sc.nextInt() - 1;  // array와 메뉴판의 번호 차이

            /* 입력받은 주문번호로 주문 받기 */
            if (menuNum >= 0 && menuNum < burgerName.length) {                          // keyset Array의 범위는 0~5이다.
                String orderName = burgerName[menuNum];                                 // 주문 햄버거 이름 저장

                order.put(orderName, order.getOrDefault(orderName, 0) + 1);   // 주문 hashmap에 햄버거 이름과 주문 수량 넣기
                System.out.println(burgerName[menuNum] + "이(가) 주문되었습니다!");

                sum += menu.get(burgerName[menuNum]);                                     // hashmap에서 이름에 대응되는 가격을 가져와 누적
                System.out.println("누적금액 : " + sum + "원");
            } else if (menuNum == -1) {                                                    // 실제로는 10이지만, array와 메뉴 번호의 차이로 10이 9로 인식
                System.out.println("주문을 종료합니다.");
            } else {
                System.out.println("잘못된 입력입니다!");
            }
        } while (menuNum != -1);                                                           // 실제로는 10이지만, array와 메뉴 번호의 차이로 10이 9로 인식

        /* 주문 종료 */
        String[] orderBurger = order.keySet().toArray(new String[0]);    // 주문 내역 hashmap을 array로 정리
        int orderAmount;                                                 // 주문한 특정 버거에 대한 가격 합계

        if (order.isEmpty()){                                            // 주문을 하지 않았을 때
            System.out.println("주문 내역이 존재하지 않습니다.");
        } else {                                                         // 주문을 했을 때
            System.out.println("------------------------------------------------------------------------");
            System.out.println("*** 주문서 ***");
            for (int i = 0; i < order.size(); i++) {                     // 주문 내역 버거 이름, 수량, 가격, 총 금액을 출력
                orderAmount = menu.get(orderBurger[i]) * order.get(orderBurger[i]);    // 햄버거 가격 * 주문 수량
                System.out.println((i + 1) + ". " + orderBurger[i] + " " + order.get(orderBurger[i]) + "개 총 " + orderAmount + "원");
            }
            System.out.println("금액 : " + sum + "원");
            System.out.println("------------------------------------------------------------------------");
        }
    }

    public void isStringAlphabet(){ // 문자열 입력받아, "모든 글자 영문자다" / "영문자 아니다." 출력
        System.out.print("문자열을 입력해주세요 : ");
        String str = sc.nextLine();

        int i = 0;
        char c;
        do {
            c = str.charAt(i);
            if (c == ' ') {
                i++;
                continue;
            }
            if (c < 'A' || (c > 'Z' && c < 'a') || c > 'z') { // 영문자가 아님
                System.out.println("모든 글자는 영문자가 아닙니다.");
                return;
            }
            i++;
        } while (i < str.length());
        System.out.println("모든 글자는 영문자입니다. ");
    }
}
