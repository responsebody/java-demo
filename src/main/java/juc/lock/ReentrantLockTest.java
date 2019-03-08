package juc.lock;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yongkai.sun
 */
public class ReentrantLockTest implements Runnable {

	private static final Lock reentrantLock = new ReentrantLock();

	private Logger logger = LoggerFactory.getLogger(ReentrantLockTest.class);
	public static int num = 0;

	@Test
	public void lockTest() {

		ReentrantLockTest reentrantLockTest = new ReentrantLockTest();
		ReentrantLockTest reentrantLockTest2 = new ReentrantLockTest();
		new Thread(reentrantLockTest).start();
		new Thread(reentrantLockTest2).start();
	}

	@Override
	public void run() {
		reentrantLock.lock();

	}
}
