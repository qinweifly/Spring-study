package com.qinwei.demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色：现在没有
        ProxyInvocationHandler pIH = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象！
        pIH.setRent(host);
        Rent proxy = (Rent) pIH.getProxy(); //这里的proxy就是动态生成的，我们没有写
        proxy.rent();
    }
}
