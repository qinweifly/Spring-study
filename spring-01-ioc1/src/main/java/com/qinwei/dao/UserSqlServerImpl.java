package com.qinwei.dao;

public class UserSqlServerImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("SqlServer获取用户数据");
    }
}
