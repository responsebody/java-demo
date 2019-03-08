package guava;

import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author sun 2019/3/8
 */
public class IterablesTest {
	public static void main(String[] args) {
		List<String> names = Lists.newArrayList("John", "Jane", "Adam", "Tom");
		Iterable<String> john = Iterables.filter(names, Predicates.equalTo("John"));
		Collection<String> result = Collections2.filter(names, Predicates.equalTo("Adam"));
		System.out.println(result);
	}
}
