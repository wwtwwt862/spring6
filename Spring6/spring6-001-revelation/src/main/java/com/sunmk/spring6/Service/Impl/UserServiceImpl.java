package com.sunmk.spring6.Service.Impl;

import com.sunmk.spring6.Dao.Impl.UserDaoImplForMySql;
import com.sunmk.spring6.Dao.UserDao;
import com.sunmk.spring6.Service.UserService;

/**
 * @author sunmk
 * @version 1.0
 * @date 2023/12/3 21:57
 * @PACKAGE_NAME IntelliJ IDEA
 * @DESCRIPTION
 * @Filename：UserServiceImpl
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImplForMySql();
        @Override
        public void deleteUser() {
            userDao.deleteUserById();
            //处理业务的代码
        }

}
