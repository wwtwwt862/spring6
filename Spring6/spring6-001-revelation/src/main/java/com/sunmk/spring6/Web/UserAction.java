package com.sunmk.spring6.Web;

import com.sunmk.spring6.Service.Impl.UserServiceImpl;
import com.sunmk.spring6.Service.UserService;

/**
 * @author sunmk
 * @version 1.0
 * @date 2023/12/3 21:54
 * @PACKAGE_NAME IntelliJ IDEA
 * @DESCRIPTION
 * @Filename：UserAction
 * 业务的持久层
 */
public class UserAction {
   private UserService userService = new UserServiceImpl();
   public void deleteUser(){
       userService.deleteUser();
   }

}
