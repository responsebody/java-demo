package basic.java8;

import org.junit.Test;

import java.util.function.BiConsumer;

/**
 * @author yongkai.sun
 */
public class FunctionTest {
	BiConsumer<String,String> biConsumer = (s, s2) -> System.out.println(s+"="+s2);

	@Test
	public void testBiConsumer(){
		biConsumer.accept("1","2");
	}
}
