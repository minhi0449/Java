package ch06.sec01;

/*
    날짜 : 2025.02.27 (목)
    이름 : 김민희
    내용 : 객체와 클래스
 */

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("강아지", "멍 멍 - "); // 강아지 객체 생성
        Animal cat = new Animal("고양이", "애용 - "); // 고양이 객체 생성

        dog.makeSound();
        cat.makeSound();

    }

}
