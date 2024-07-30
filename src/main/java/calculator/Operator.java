package calculator;

public interface Operator { // 오버로딩
    // 사칙 연산 메서드의 형태(이름, 매게변수)가 모두 같기 때문에 추상메서드로 만들었다.
      int operatre(int firstNumber, int secondNumber);
}
