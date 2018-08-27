package basic.collection;

import com.google.common.collect.Maps;
import com.vip.vjtools.vjkit.concurrent.threadpool.ThreadPoolBuilder;
import org.junit.Test;

import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author yongkai.sun
 */
public class HashMapTest {
	@Test
	public void testResize() {

		final Map map = Maps.newHashMap();
		new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					map.put("i" + i, "i" + i);
				}
			}
		}.run();


	}
}
