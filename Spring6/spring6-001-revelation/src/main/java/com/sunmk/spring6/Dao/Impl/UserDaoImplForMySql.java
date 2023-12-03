package com.sunmk.spring6.Dao.Impl;

import com.sunmk.spring6.Dao.UserDao;

/**
 * @author sunmk
 * @version 1.0
 * @date 2023/12/3 21:55
 * @PACKAGE_NAME IntelliJ IDEA
 * @DESCRIPTION
 * @Filename：UserDaoImpl
 */
public class UserDaoImplForMySql    implements UserDao {
    @Override
    public void deleteUserById() {
        System.out.println("mysql数据库正在删除用户信息.....");
    }
}
