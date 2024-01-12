package com.github.yeecode.mybatisdemo;

import com.github.yeecode.mybatisdemo.model.UserProxy;
import com.github.yeecode.mybatisdemo.model.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URL;
import java.util.Enumeration;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) throws Exception {
        // 生成被代理对象
        User user = new User();

        // 生成代理，顺便告诉代理它要代理谁
        UserProxy userProxy = new UserProxy(user);

        // 触发代理方法
        userProxy.sayHello("易哥");

        Enumeration<URL> resources = DemoApplication.class.getClassLoader().getResources("application.properties");
        while (resources.hasMoreElements())
            System.out.println(resources.nextElement());
    }
}
