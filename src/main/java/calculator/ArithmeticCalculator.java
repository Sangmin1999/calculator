package calculator;

public class ArithmeticCalculator extends Calculator { // Calculator 클래스를 상속
    // 초기화된 이후에 변경되지 않으므로 (final)
    private final AddOperator addOperator; // 사칙연산 클래스 필드 선언
    private final SubstractOperator substractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;
    private final ModOperator modOperator;

    public ArithmeticCalculator() { // 부모 생성자를 자동 호출
        addOperator = new AddOperator(); // 사칙연산 클래스 필드 생성
        substractOperator = new SubstractOperator();
       multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
        modOperator = new ModOperator();
    }
    @Override
    public int calculate(int firstNumber, int secondNumber, char operator) throws InputErrorException {
        int result = 0;
        switch (operator) {
            case '+' : // 사칙 연산을 수행 후 result에 저장
                result = addOperator.operatre(firstNumber , secondNumber);
                break;
            case '-' :
                result = substractOperator.operatre(firstNumber, secondNumber);
                break;
            case '*' :
                result = multiplyOperator.operatre(firstNumber, secondNumber);
                break;
            case '/' :
                if (secondNumber == 0)  // 나눗셈 연산에서 두번째 정수에 0이 입력되는 경우 Exception 발생
                    throw new InputErrorException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");

                else
                    result = divideOperator.operatre(firstNumber, secondNumber);
                break;
            case '%' :
                result = modOperator.operatre(firstNumber, secondNumber);
                break;
        }
        return result;
    }
    // 사용하지 않는 오버라이딩 메서드를 접근제어자를 protected를 써서 접근 불가능하게 만듬
    @Override
    protected double calculate(int radius) {
        return 0;
    }
}
