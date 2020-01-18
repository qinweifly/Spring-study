package com.qinwei.pojo;

import lombok.Data;

@Data
public class User {
    private String name;

    public User() {
        System.out.println("User 的无参构造！！！");
    }

    public User(String name) {
        this.name = name;
        System.out.println("User 的有参构造！！！");
    }

    public void show(){
        System.out.println("name = "+name);
    }

}
