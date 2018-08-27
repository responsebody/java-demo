package juc.basic;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yongkai.sun
 */
public class ValitileTest {
	public volatile int inc = 0;
	private Lock lock = new ReentrantLock();

	public void increase() {
		try {
			lock.lock();
			inc++;
		}finally {
			lock.unlock();
		}

	}

	public static void main(String[] args) {
		final ValitileTest test = new ValitileTest();
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				for (int j = 0; j < 1000; j++) {
					test.increase();
				}
			}).start();
		}
		while(Thread.activeCount()>1){
			Thread.yield();
		}
		System.out.println(test.inc);
		System.out.println(test.inc);
	}
}
