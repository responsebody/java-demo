package redis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * @author yongkai.sun
 */
public class RedisTest {

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	public void valueOperationsTest1(){
		ValueOperations valueOperations = redisTemplate.opsForValue();
		valueOperations.set("test","test");
	}
}
