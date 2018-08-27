package basic.collection;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * @author yongkai.sun
 */
public class ArrayListTest {

	@Test
	public void testGrow(){
		List<Integer> demo = Lists.newArrayList();
		for(int i =0 ;i<10;i++){
			demo.add(i);
		}
		demo.add(11);
	}
}
