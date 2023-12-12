package org.sunmk.bean;

import java.util.Arrays;

/**
 * org.sunmk.bean
 *
 * @author: wwt
 * @Description TODO
 * @Date 2023/12/8 15:44
 */


public class YuQian {
    private String [] hobbies;

    private Woman[] woman;

    @Override
    public String toString() {
        return "YuQian{" +
                "hobbies=" + Arrays.toString(hobbies) +
                ", woman=" + Arrays.toString(woman) +
                '}';
    }

    public void setWoman(Woman[] woman) {
        this.woman = woman;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

}
