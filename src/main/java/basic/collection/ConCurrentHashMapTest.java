package basic.collection;

import com.google.common.collect.Maps;
import com.google.common.collect.Streams;
import org.junit.Test;

import java.util.Map;
import java.util.stream.Stream;

/**
 * @author yongkai.sun
 */
public class ConCurrentHashMapTest {
	Map<String,String> demo = Maps.newConcurrentMap();
	@Test
	public void test(){
		demo.put("a","a");
		demo.put("a","a");
		System.out.println(demo);
	}
}
