package org.sunmk.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * org.sunmk.bean
 *
 * @author: wwt
 * @Description TODO
 * @Date 2023/12/12 20:06
 */


public class Person {

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }


    //    list 无序可重复
    //    注入list集合
    private List<String > names ;

    //    注入set集合
    //    无序不可重复
    private Set<String> address;

    /**
     * 注入map集合，键值对
     */
    private Map<Integer,String> phones;

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", address=" + address +
                ", phones=" + phones +
                ", properties=" + properties +
                '}';
    }

    /**
     * 注入properties ，key和value必须是字符串类型
     * 注入属性类对象，本质上也是一个map集合
     * properties 的父类是Hashtable，
     */
    private Properties properties;

    public void setPhones(Map<Integer, String> phones) {
        this.phones = phones;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
