package org.sunmk.service;

import org.sunmk.dao.UserDao;

/**
 * org.sunmk.service
 *
 * @author: wwt
 * @Description TODO
 * @Date 2023/12/5 13:18
 */


public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //必须停工一个set方法，来给userDao属性赋值
    public void  saveUser(){
        userDao.insert();
    }
}
