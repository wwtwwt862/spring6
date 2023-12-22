package org.sunmk.bean;

/**
 * org.sunmk.bean
 *
 * @author: wwt
 * @Description TODO
 * @Date 2023/12/12 20:45
 */


public class Cat {
    private String name ;
    private int age ;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
