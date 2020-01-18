package com.qinwei.pojo;

import lombok.Data;

@Data
public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT 的无参构造！！！");
    }

    public void show(){
        System.out.println("name = "+name);
    }

}
