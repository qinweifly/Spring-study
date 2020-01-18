package com.qinwei.log;

import org.springframework.aop.AfterReturningAdvice;
import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"方法被执行了"+"返回结果为："+returnValue);
    }
}
