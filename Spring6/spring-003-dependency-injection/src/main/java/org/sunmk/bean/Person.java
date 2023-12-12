package org.sunmk.bean;

import java.util.List;
import java.util.Set;

/**
 * org.sunmk.bean
 *
 * @author: wwt
 * @Description TODO
 * @Date 2023/12/12 20:06
 */


public class Person {
    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", address=" + address +
                '}';
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

//    public Person(List<String> names, Set<String> address) {
//        this.names = names;
//        this.address = address;
//    }

    //    list 无序可重复
    private List<String > names ;
//    无序不可重复
    private Set<String> address;
}
