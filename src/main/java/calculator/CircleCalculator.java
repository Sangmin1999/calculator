package calculator;

public class CircleCalculator extends Calculator{
    private static final double Pi = 3.14; // 원의 지름 값은 3.14로 변하지 않는 값이기 때문에

    // static final을 이용하여 프로그램에서 변경되지 않는 값을 정의
    @Override
    public double calculate(int radius) {
        return Pi* radius *radius;
    }
}
