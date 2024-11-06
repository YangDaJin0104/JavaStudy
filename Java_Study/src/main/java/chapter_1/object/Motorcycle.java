package chapter_1.object;

import chapter_1.object.Vehicle;

class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("버튼을 눌러 시동을 거세요.");
    }
}
