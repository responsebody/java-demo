package juc.lock;

import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;

/**
 * @author sun 2019/1/17
 */
public class MyLock extends AbstractQueuedLongSynchronizer {

	@Override
	protected boolean tryAcquire(long arg) {
		return super.tryAcquire(arg);
	}

	@Override
	protected boolean tryRelease(long arg) {
		return super.tryRelease(arg);
	}

	@Override
	protected boolean isHeldExclusively() {
		return super.isHeldExclusively();
	}
}
