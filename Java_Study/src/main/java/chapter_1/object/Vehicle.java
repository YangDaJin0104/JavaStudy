package chapter_1.object;

/**
 * Vehicke는 추상 클래스이고 startEngine이라는 추상 메서드를 정의한다.
 * Car와 Motorcycle는 Vehicle를 상속받고 각각 startEngine메서드를 구체적으로 구현*/
abstract class Vehicle {
    abstract void startEngine();

    public void displayType() {
        System.out.println("이동수단");
    }
}
