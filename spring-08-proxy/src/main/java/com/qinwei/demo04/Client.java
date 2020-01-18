package com.qinwei.demo04;

import com.qinwei.demo02.UserService;
import com.qinwei.demo02.UserServiceImpl;


public class Client {
    public static void main(String[] args) {
        //真实角色
        UserService userService =new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler pIH = new ProxyInvocationHandler();
        pIH.setTarget(userService);//设置要代理的对象
        //动态生成代理类
        UserService proxy = (UserService) pIH.getProxy();

        proxy.add();
        proxy.delete();


    }

}
