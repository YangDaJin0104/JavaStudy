package chapter_1.object;

import chapter_1.object.Animal;

/**
 * 오버라이딩 = Aninmal 클래스를 상속받아 매서드를 재정의
 */
public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("냐옹");
    }
}
