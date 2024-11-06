package chapter_1.object;

import chapter_1.object.Vehicle;

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("차 키가 필요합니다.");
    }
}
