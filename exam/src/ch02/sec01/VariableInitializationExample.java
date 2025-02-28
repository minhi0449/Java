package ch02.sec01;

/*
    날짜 : 2025.02.28 (금)
    이름 : 김민희
    내용 : 자바 언어 기초 - 변수 (초기화 되지 않은 변수를 연산식에 사용한 예제)
 */

public class VariableInitializationExample {
    public static void main(String[] args) {
        // 변수 value 선언
        int value;

        // 연산 결과를 변수 result 의 초기값으로 대입
        int result = value + 10; // 빨간 밑줄은 컴파일 오류를 표시한 것이다.

        // 변수 result 값을 읽고 콘솔에 출력
        System.out.println("result" + result);

        /*
            /Users/kimminimanimu/Desktop/workspace/java/exam/src/ch02/sec01/VariableInitializationExample.java:9:22
            java: variable value might not have been initialized
         */
    }

}
