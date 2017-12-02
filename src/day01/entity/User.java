package day01.entity;

import day01.HelloAnnotation;

/**
 * Created by Administrator on 2017/12/2.
 */
@HelloAnnotation(name = "张三",like = {"张三","李四"})
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
