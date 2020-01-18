package com.qinwei.poji;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {

    @Value("qinwei-hehehehehhehe") //
    private String name;
}
