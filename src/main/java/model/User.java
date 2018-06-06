package model;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Objects;

/*
 * author yongkai.sun
 */
public class User {
    private String code;
    private String name;
    private Integer sex;
    private Integer age;
    private String city;

    public User() {
    }

    public User(String code, String name, Integer sex, Integer age, String city) {
        this.code = code;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSex() {
        return sex;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    public static List<User> morkUserData() {
        List<User> users = Lists.newArrayList();
        users.add(new User("U001","张三",01,20,"上海"));
        users.add(new User("U002","张三",02,20,"上海"));
        users.add(new User("U003","小小",02,20,"上海"));
        users.add(new User("U004","大大",01,20,"上海"));
        return users;
    }
}
