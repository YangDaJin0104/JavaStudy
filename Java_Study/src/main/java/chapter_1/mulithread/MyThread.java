package chapter_1.mulithread;

/**
 * Thread 클래스를 상속받아 구현
 * Thread 클래스를 상속받아 run()메서드를 재정의하고, start()메서드를 호출하면 스레드가 실행
 * start()메서드는 스레드를 시작하며 내부적으로 run() 메서드 호출*/
public class MyThread extends Thread {
    /*@Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread Running : " + i);
        }
    }*/
    public MyThread(Runnable task) {
        super(task); // Runable 객체를 Thread의 생성자로 전달
    }
}
