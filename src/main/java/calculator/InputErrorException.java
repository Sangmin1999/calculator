package calculator;

public class InputErrorException extends Exception{ // 입력값에 문제가 있다고 말해주는 Exception을 상속받는 InputErrorException 생성
    public InputErrorException(String msg) { // 생성자 , 메세지를 받는다
        super(msg); // 부모 생성자로 전달
    }
}
