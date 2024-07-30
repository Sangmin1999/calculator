package calculator;

public class AddOperator implements Operator { // Operator 클래스를 상속받아서 오버라이딩(재정의)을 한다
    public int operatre(int firstNumber, int secondNumber) { // 메서드 구현
        return firstNumber + secondNumber;
    }
}
