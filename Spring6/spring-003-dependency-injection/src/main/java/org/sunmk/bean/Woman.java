package org.sunmk.bean;

/**
 * org.sunmk.bean
 *
 * @author: wwt
 * @Description TODO
 * @Date 2023/12/8 16:04
 */


public class Woman {
    private String name ;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                '}';
    }
}
