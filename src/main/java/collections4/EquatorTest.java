package collections4;

import model.User;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Equator;
import org.junit.Test;

import java.util.List;
import java.util.Objects;

/*
 * author yongkai.sun
 */
public class EquatorTest {

    @Test
    public void equatorName() {
        List<User> userList = DistinctListUtils.distinct(User.morkUserData(), new Equator<User>() {

            @Override
            public boolean equate(User o1, User o2) {
                return o1 == o2 || o1 != null && o2 != null
                        && Objects.equals(o1.getName(), o2.getName());
            }

            @Override
            public int hash(User o) {
                return o == null ? -1 : Objects.hash(o.getName(), o.getName());
            }
        });
        System.out.println(CollectionUtils.size(userList));
    }

    @Test
    public void equatorNameAndSex() {
        List<User> userList = DistinctListUtils.distinct(User.morkUserData(), new Equator<User>() {

            @Override
            public boolean equate(User o1, User o2) {
                return o1 == o2 || o1 != null && o2 != null
                        && Objects.equals(o1.getName(), o2.getName())
                        && Objects.equals(o1.getSex(), o2.getSex());
            }

            @Override
            public int hash(User o) {
                return o == null ? -1 : Objects.hash(o.getName(), o.getSex());
            }
        });
        System.out.println(CollectionUtils.size(userList));
    }
}
