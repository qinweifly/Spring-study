##常用依赖
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">
    <context:annotation-config/>
</beans>
```
##lombok依赖导入
```xml
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.8</version>
        </dependency>
```


##1、使用注解开发
###说明
在spring2之后，要想使用注解形式，必须要引入aop包
在配置文件中，还要引入一个context约束
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config/>

</beans>
```

- @Component: 组件，放在类上，说明这个类被spring管理了，就是bean
    - dao [@Repository]
    - service [@Service]
    - controller [@Controller @RestController]
    这四个注解功能都是一样的，都代表将某个类注册到spring中，装配Bean
##2、自动装配
- @AutoWired:
    如果AutoWired不能唯一自动装配上属性，则需要通过@Qualifier(value="xxx")
- @Nullable： 字段标记了这个注解，说明这个字段可以为null      
- @Resource: 自动装配通过名字
    
##3、作用域
```java
    @Component
    @Scope("Singleton")
    public class User {
    
        @Value("覃炜-heiheihei")
        public String name;
    }
```

##4、小结
  - xml与注解：
    - xml更加万能。适用于任何场合，维护简单方便
    - 注解 不是自己的类无法使用，维护相对复杂
  最佳实践：
    - xml来管理bean
    - 注解只负责完成属性的注入
    - 我们在使用的过程中只需要注意一个问题：必须要让注解生效，需要开启注解的支持
    ```xml
            <!--指定要扫描的包，这个包下的注解就会生效-->
            <context:component-scan base-package="com.qinwei"/>
            <context:annotation-config/>
    ```
##5、使用Java的方式配置Spring
我们现在要完全不使用Spring的xml配置了，全权交给java来做
JavaConfig是Spring的一个子项目，在Spring4之后，它成为一个核心功能                                                                                                                                                                                                                                                                                                                                             