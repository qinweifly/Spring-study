package com.qinwei.service;

import com.qinwei.dao.UserDao;
import com.qinwei.dao.UserDaoImpl;
import com.qinwei.dao.UserDaoMysqlImpl;
import com.qinwei.dao.UserOracleImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //利用set实现动态创建对象
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
