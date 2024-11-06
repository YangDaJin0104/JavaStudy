package chapter_1.object;

import chapter_1.object.Animal;

/**
 * 오버라이딩 = Animal 클래스를 상속받아 메서드를 재정의
 */
public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
