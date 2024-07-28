package calculator;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index = 0;
        Calculator calculator = new Calculator(); // Calculator 클래스의 인스턴스를 생성

        while (true) {

        System.out.print("첫 번째 숫자를 입력하세요: ");
        //Scanner를 사용하여 양의 정수를 입력받고 변수에 저장합니다.
        int firstNumber = sc.nextInt();


        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNumber = sc.nextInt();



            sc.nextLine(); // nextInt();로 인해 남아있는 것을 없애줌

            try {
                System.out.print("사칙연산 기호를 입력하세요: "); // +,-,*,/
                // charAt(idx) : charAt 메서드는 매개변수로 char 타입으로 변환 하고자하는 문자열의 위치를 받는다.
                char operator = sc.next().charAt(0);
                int result = calculator.calculate(firstNumber, secondNumber, operator);
                // calculator.calculate()를 호출하여 계산을 하고 결과를 result에 저장
                System.out.println("결과: " + result);
                calculator.getResultList().add(result);

            } catch (InputErrorException e) { // 잘못된 입력이 발생할시 이를 잡아서 에러 메세지를 출력
                System.out.println(e.getMessage());

            }
            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");

            if (sc.next().equals("remove")) {
                calculator.removeResultList(); //"remove" 입력시 가장 첫번째 입력값 제거
                // calculator 클래스에 공용 메서드를 호출

            }

            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (sc.next().equals("inquiry")) {
                calculator.inquiryResultList(); // 결과 조회
            }
                sc.nextLine(); //버퍼에 남아있는 개행문자 제거
                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
                String exit = sc.nextLine();
                if (exit.equals("exit")) {
                    break;
                }
            }


    }


}
