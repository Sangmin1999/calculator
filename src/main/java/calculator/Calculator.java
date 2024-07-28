package calculator;

import java.util.ArrayList;
import java.util.LinkedList;

public class Calculator {// 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정
    private LinkedList<Integer> resultList = new LinkedList<>(); // private 접근 제어자 사용
    // 연산 결과를 저장하기 위한 컬렉션 선언 및 생성

    public LinkedList<Integer> getResultList() { //resultList getter 메서드 이름의 규칙 : get + 필드 이름
        return resultList;
    }

    public void setResultList(LinkedList<Integer> resultList) { // setter 규칙 : set + 필드 이름
        this.resultList = resultList;
    }

    public int calculate(int firstNumber, int secondNumber, char operator) throws InputErrorException {
        int result = 0;
        switch (operator) {
            case '+' : // 사칙 연산을 수행 후 result에 저장
                result = firstNumber + secondNumber;
                break;
            case '-' :
                result = firstNumber - secondNumber;
                break;
            case '*' :
                result = firstNumber * secondNumber;
                break;
            case '/' :
                if (secondNumber == 0)  // 나눗셈 연산에서 두번째 정수에 0이 입력되는 경우 Exception 발생
                    throw new InputErrorException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");

                else
                    result = firstNumber / secondNumber;
                break;
        }
                return result; // 사칙연산된 결과값을 리턴
    }

    // 4. Calculator 클래스에 저장된 연산 결과들 중
    // 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정
    public void removeResultList() { // 공용 메서드 선언 , 반환값은 없고(void), 파라미터도 받지 않는다.
        resultList.remove(0);
    }
}
