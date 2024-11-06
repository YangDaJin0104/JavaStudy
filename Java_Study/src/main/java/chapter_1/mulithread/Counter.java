package chapter_1.mulithread;

/**
 * synchronized 키워드를 increment 메서드에 추가하여
 * 한번에 하나의 스레드만 increment 메서드에 접근
 * 이렇게 하면 count 값이 여러 스레드에서 동시에 변경되는 문제를 방지한다. */
class Counter {
    private int cnt = 0;

    public synchronized void increment() {
        cnt++;
    }

    public int getCount() {
        return cnt;
    }
}
