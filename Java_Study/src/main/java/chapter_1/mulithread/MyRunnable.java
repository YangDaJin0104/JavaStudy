package chapter_1.mulithread;

/**
 * Runnable 인터페이스 구현
 * Runnable 인터페이스를 구현하여 run() 메서드를 정의하고, Thread 객체에 Runnable 객체를 전달하여 실행한다.
 * Runnable 인터페이스는 다중 상속의 유연성을 제공*/
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable Running : " + i);
        }
    }
}
