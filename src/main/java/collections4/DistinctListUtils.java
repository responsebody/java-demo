package collections4;

import com.google.common.collect.Lists;
import org.apache.commons.collections4.Equator;
import org.apache.commons.collections4.IterableUtils;

import java.util.List;

/*
    Equator
 * author yongkai.sun
 */
public class DistinctListUtils {

    public static <T> List<T> distinct(List<T> items, Equator<T> equator) {
        List<T> result = Lists.newArrayList();
        for (T item : items) {
            if (!IterableUtils.contains(result, item, equator)) {
                result.add(item);
            }
        }
        return result;
    }
}
