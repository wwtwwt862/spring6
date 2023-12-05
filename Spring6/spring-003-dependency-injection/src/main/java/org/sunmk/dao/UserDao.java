package org.sunmk.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLOutput;

/**
 * org.sunmk.dao
 *
 * @author: wwt
 * @Description TODO
 * @Date 2023/12/5 13:13
 */


public class UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);
    public void insert(){
//        System.out.println("正在进行插入语句");
//        使用一下Log4j2日志框架
        logger.info("数据库正在保存用户信息");
    }

}
