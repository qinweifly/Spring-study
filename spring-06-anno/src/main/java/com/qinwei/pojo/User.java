package com.qinwei.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Singleton")
public class User {

    @Value("覃炜-heiheihei")
    public String name;
}
