package calculator;

public class CircleCalculator extends Calculator{
    private static final double Pi = 3.14; // 원의 지름 값은 3.14로 변하지 않는 값이기 때문에

    // 사용하지 않는 오버라이딩 메서드를 접근제어자를 protected를 써서 접근 불가능하게 만듬
    @Override
    protected int calculate(int firstNumber, int secondNumber, char operator) throws InputErrorException {
        return 0;
    }


    @Override
    public double calculate(int radius) {
        return Pi* radius *radius;
    }
}
