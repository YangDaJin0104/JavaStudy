package chapter_1.mulithread;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        MyThread thread1 = new MyThread(task);
        MyThread thread2 = new MyThread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count : " + counter.getCount());

        Thread thread3 = new Thread(new MyRunnable());
        Thread thread4 = new Thread(new MyRunnable());

        thread3.start();
        thread4.start();
    }
}
