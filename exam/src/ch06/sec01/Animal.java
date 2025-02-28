package ch06.sec01;

/*
    날짜 : 2025.02.27 (목)
    이름 : 김민희
    내용 : 클래스 설계 정의
 */

class Animal { // 클래스 설계도 만듬

    String name; // 동물의 이름
    String sound; // 동물이 내는 소리

    // 동물이 테어날 때 (생성자)ㅠㅍ
    Animal (String name, String sound){
        this.name = name; // this.name -> 현재 객체
        this.sound = sound;
    }
    // 동물이 소리 내는 기능 (메서드)
    void makeSound(){
        System.out.println(name + " 가 " + sound + " 소리 낸다아앙--!@ ");
    }

}
