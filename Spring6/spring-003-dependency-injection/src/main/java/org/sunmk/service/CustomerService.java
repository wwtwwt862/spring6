package org.sunmk.service;

import org.sunmk.dao.UserDao;
import org.sunmk.dao.VipDao;

/**
 * org.sunmk.service
 * bean
 * @author: wwt
 * @Description TODO
 * @Date 2023/12/7 17:24
 */


public class CustomerService {
    private UserDao userDao;
    private VipDao vipDao ;

    public CustomerService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void save(){
        userDao.insert();
        vipDao.insert();
    }
}
