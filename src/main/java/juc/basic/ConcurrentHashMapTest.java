package juc.basic;

import org.junit.Test;

/**
 * @author yongkai.sun
 */
public class ConcurrentHashMapTest {
	static final int HASH_BITS = 0x7fffffff;

	@Test
	public void testSpread(){
		String key = "啊啊啊";
		System.out.println(key.hashCode());
		int spread = spread(key.hashCode());
		System.out.println(spread);
	}

	static final int spread(int h) {
		return (h ^ (h >>> 16)) & HASH_BITS;
	}

}
