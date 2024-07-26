package calculator;

import java.text.BreakIterator;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] resultList = new int[10];
        int index = 0;

        while (true) {

        System.out.print("첫 번째 숫자를 입력하세요: ");
        //Scanner를 사용하여 양의 정수를 입력받고 변수에 저장합니다.
        int num1 = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: "); // +,-,*,/
        // charAt(idx) : charAt 메서드는 매개변수로 char 타입으로 변환 하고자하는 문자열의 위치를 받는다.
        char operator = sc.next().charAt(0);

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();



        int result = 0; // switch문에서 result 변수를 사용하기위해 선언

        switch (operator) { // switch 문을 통해서 사칙연산 기호를 입력했을때 4가지 경우를 만들어준다
            case '+' :
                result = num1 + num2;
                System.out.println("결과: " + result);
                break;
            case '-' :
                result = num1 - num2;
                System.out.println("결과: " + result);
                break;
            case '*' :
                result = num1 * num2;
                System.out.println("결과: " + result);
                break;
            case '/' :
                if (num2 == 0) { // 나눗셈 연산에서 두번째 정수에 0이 입력되는 경우에 출력
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }
                result = num1 / num2;
                System.out.println("결과: " + result);
                break;
            default:
                System.out.println("정확한 사칙연산 기호를 입력해주세요.");
                break;
        }
            resultList[index++] = result; // 연산의 결과를 배열에 저장하고 index를 하나씩 증가
            sc.nextLine(); //버퍼에 남아있는 개행문자 제거
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.nextLine();
            if (exit.equals("exit")) {
                break;
            }
    }


    }


}
